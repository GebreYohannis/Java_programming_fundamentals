package annotations;

public @interface MyAnnotation {
    String param1();

    String param2();

    int[] param3(); // Array parameters
}

@interface AnnotationWithDefaultValue {
    String param1() default "Param 1";

    boolean param2() default true;

    int[] param3() default {1, 3, 4, 5};
}