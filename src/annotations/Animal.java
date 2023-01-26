package annotations;

@MyAnnotation(value1 = 1, value2 = "")
public class Animal {

    public String name = "Animal";
    public void eatSomething(){
        System.out.println("Eating something");
    }
}
