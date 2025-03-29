package annotations;


import java.lang.annotation.Annotation;
import java.util.Arrays;

public class AnnotationAtRuntimeCheck {
    @AnnotationRetentionPolicyForRuntime
    static class RuntimeCheck1 {

    }

    @DefaulAnnotation
    static class RuntimeCheck2 {

    }

    public static void show() {
        Annotation[] annotationRuntimeType = RuntimeCheck1.class.getAnnotations();
        Annotation[] annotationDefaultType = RuntimeCheck2.class.getAnnotations();

        System.out.println("Annotation At RunTime: " + Arrays.toString(annotationRuntimeType));
        System.out.println("Annotation Default: " + Arrays.toString(annotationDefaultType));

        var declaredAnnotations = RuntimeCheck1.class.getPackageName();
        System.out.println("DeclaredAnnotations: " + declaredAnnotations);
    }
}
