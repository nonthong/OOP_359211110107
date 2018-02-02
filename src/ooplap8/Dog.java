package ooplap8;

//Dog is aPet
//Dog is sub-class
//Pet is super-class

public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
