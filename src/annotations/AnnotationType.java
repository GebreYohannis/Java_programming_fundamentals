package annotations;

import java.beans.Transient;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Class, interface (including annotation interface), enum, or record declaration
@Target({ElementType.TYPE})
public @interface AnnotationType {
}

@Target({ElementType.TYPE_USE})
@interface ClassAnnotation {

}

@Target({ElementType.PACKAGE})
@interface PackageAnnotation {

}

@Target({ElementType.METHOD})
@interface MethodAnnotation {

}

@Target({ElementType.FIELD})
@interface FieldAnnotation {

}

@Target({ElementType.LOCAL_VARIABLE})
@interface LocalVariableAnnotation {

}

@Target({ElementType.TYPE_PARAMETER})
@interface ParameterTypeAnnotation {

}

// //Annotation interface declaration (Formerly known as an annotation type.)
@Target({ElementType.ANNOTATION_TYPE})
@interface AnnotationInterfaceDeclarationAnnotation {

}
