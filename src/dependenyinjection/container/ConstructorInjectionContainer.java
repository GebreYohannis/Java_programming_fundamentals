package dependenyinjection.container;

import dependenyinjection.annotations.Component;
import dependenyinjection.annotations.InjectConstructor;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructorInjectionContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();
    private final Map<Class<?>, Class<?>> interfaceBindings;

    public ConstructorInjectionContainer(
            List<Class<?>> classes, Map<Class<?>, Class<?>> interfaceBindings
    ) {
        this.interfaceBindings = interfaceBindings;
        for (Class<?> clazz : classes) {
            if(clazz.isAnnotationPresent(Component.class))
                getInstance(clazz);
        }

    }

    private Object[] getArguments(Constructor<?> injectConstructor) {
        Object[] args = Arrays.stream(injectConstructor.getParameterTypes())
                .map(this::getInstance)
                .toArray();
        return args;
    }

    private <T> Constructor<?> getInjectConstructor(Class<T> clazz) {
        Class<?> concreteClass = resolveImplementation(clazz);
        Constructor<?> injectConstructor = Arrays.stream(concreteClass.getConstructors())
                .filter(constructor -> constructor.isAnnotationPresent(InjectConstructor.class))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No @InjectConstructor Constructor found for " + clazz.getName()));
        return injectConstructor;
    }

    private Class<?> resolveImplementation(Class<?> type) {
        if (type.isInterface()) {
            if (!interfaceBindings.containsKey(type))
                throw new RuntimeException("No implementation found for interface " + type.getName());
            return interfaceBindings.get(type);
        }
        return type;
    }

    public <T> T getInstance(Class<T> clazz) {
        if (instances.containsKey(clazz))
            return clazz.cast(instances.get(clazz));
        Constructor<?> injectConstructor = getInjectConstructor(clazz);
        Object[] args = getArguments(injectConstructor);
        try {
            Object instance = injectConstructor.newInstance(args);
            instances.put(clazz, instance);
            return clazz.cast(instance);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance for " + clazz.getName(), e);
        }
    }
}
