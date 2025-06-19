package m02;

public class Dog extends Animal implements Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String speak() {
        return "Woof! My name is " + getName() + ".";
    }

    @Override
    public String play() {
        return "I love playing fetch!";
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
