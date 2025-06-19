package m02;

public class Cat extends Animal implements Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String speak() {
        return "Meow. I'm " + getName() + ".";
    }

    @Override
    public String play() {
        return "I enjoy chasing strings.";
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
