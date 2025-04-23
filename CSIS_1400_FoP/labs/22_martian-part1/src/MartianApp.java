public class MartianApp {
    public static void main(String[] args) {
        Martian martian = new Martian();
        System.out.println(martian);

        Martian[] martians = {new Martian(), new Martian(), new Martian()};

        for (Martian m : martians) {
            m.doSomething();
        }

    }
}
