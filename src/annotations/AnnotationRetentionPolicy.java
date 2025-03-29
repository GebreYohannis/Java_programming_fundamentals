package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// The default value
@Retention(RetentionPolicy.CLASS)
public @interface AnnotationRetentionPolicy {
}

@Retention(RetentionPolicy.SOURCE)
@interface AnnotationRetentionPolicyForSource {

}

@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationRetentionPolicyForRuntime {

}

