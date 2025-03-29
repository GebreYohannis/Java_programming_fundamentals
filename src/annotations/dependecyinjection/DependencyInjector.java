package annotations.dependecyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DependencyInjector {
    private final Map<Class<?>, Object> dependencies = new HashMap<>();

    public void register(Class<?> clazz, Object instance) {
        dependencies.put(clazz, instance);
    }

    public Map<Class<?>, Object> getDependencies() {
        return dependencies;
    }

    public void injectDependency(Object target) {

        Field[] fields = target.getClass().getDeclaredFields();

        for (var field : fields) {
            if (field.isAnnotationPresent(InjectDependency.class)) {
                field.setAccessible(true);
                Object dependency = dependencies.get(field.getType());
                if (dependency == null) {
                    throw new RuntimeException(
                            "Error! Dependency not registered with this type: "
                                    + field.getType()
                    );
                }

                try {
                    field.set(target, dependency);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
