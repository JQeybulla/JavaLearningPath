package annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestAnnotation {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception{

        // Checking @Override
        Animal dog = new Dog();
        dog.eatSomething();

        // Checking @SuppressWarnings
        ArrayList list = new ArrayList();
        list.add("One");
        list.add("Two");
        list.add("Three");

        for (Object obj:list){
            System.out.println(obj);
        }

        // Checking @Deprecated
        Dog dog1 = new Dog();
        dog1.deprecatedMethod();

        // Getting value of Annotation

        Dog dog2 = new Dog();
        Method method = dog2.getClass().getMethod("testMethod");
        MyAnnotation manno = method.getAnnotation(MyAnnotation.class);
        System.out.println(manno.value2());
    }
}
