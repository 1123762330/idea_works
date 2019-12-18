package demo.AnnotationReflectDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();
    String methodName();

    /*public class ProImpl implements Pro{

        @Override
        public String className() {
            return "demo.annotation.Show";
        }

        @Override
        public String methodName() {
            return "show";
        }
    }*/
}

