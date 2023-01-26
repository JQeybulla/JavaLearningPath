package annotations;

public class Dog extends Animal {

    public String name = "Dog";

    @Override
    public void eatSomething(){
        System.out.println("Dog is eating something");
    }

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("This is a deprecated method");
    }

    @MyAnnotation(value1 = 10, value2 = "Salam")
    public void testMethod(){
        System.out.println("test");
    }
}
