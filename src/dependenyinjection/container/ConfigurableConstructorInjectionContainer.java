package dependenyinjection.container;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dependenyinjection.annotations.Component;
import dependenyinjection.annotations.InjectConstructor;
import dependenyinjection.annotations.Value;


public class ConfigurableConstructorInjectionContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();
    private final Map<Class<?>,Class<?>> interfaceBindings;
    private final Map<String, Object> configValue;

    public ConfigurableConstructorInjectionContainer(
            List<Class<?>> components,
            Map<Class<?>, Class<?>> interfaceBindings,
            Map<String, Object> configValue
    ) {
        this.interfaceBindings = interfaceBindings;
        this.configValue = configValue;
        for (var clazz : components) {
            if (clazz.isAnnotationPresent(Component.class)) {
                getInstance(clazz);
            }
        }
    }

    public  <T>  T getInstance(Class<T> clazz) {
        if (instances.containsKey(clazz))
            return clazz.cast(instances.get(clazz));

        Class<?> concreteClass = resolveImplementation(clazz);
        Constructor<?> injectConstructor = getInjectedConstructor(concreteClass);
        Object[] args = getConstructorParameters(injectConstructor);

        try {
           Object instance = injectConstructor.newInstance(args);
           instances.put(clazz,instance);
           return clazz.cast(instance);
       } catch (Exception e) {
           throw new RuntimeException("Failed to create instance for " + clazz.getName(),e);
       }
    }

    private Object[] getConstructorParameters(Constructor<?> injectConstructor) {
        Object[] args = Arrays.stream(injectConstructor.getParameters())
               .map(parameter -> {
                   if (parameter.isAnnotationPresent(Value.class)) {
                       String key = parameter.getAnnotation(Value.class).keys();
                       return configValue.get(key);
                   }else  {
                       return getInstance(parameter.getType());
                   }
               })
               .toArray();
        return args;
    }

    private static Constructor<?> getInjectedConstructor(Class<?> concreteClass) {
        Constructor<?> injectConstructor =  Arrays.stream(concreteClass.getConstructors())
                .filter(constructor -> constructor.isAnnotationPresent(InjectConstructor.class))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No @InjectConstructor constructor for " + concreteClass.getName()));
        return injectConstructor;
    }

    private  Class<?> resolveImplementation(Class<?> clazz) {
        if (clazz.isInterface()) {
            if (!interfaceBindings.containsKey(clazz))
                throw new RuntimeException("No implementation bound for interface: "+ clazz.getName());
            return interfaceBindings.get(clazz);
        }
        return clazz;
    }

}
