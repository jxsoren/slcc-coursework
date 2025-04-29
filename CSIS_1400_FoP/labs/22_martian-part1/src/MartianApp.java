public class MartianApp {
    public static void main(String[] args) {
//        Martian[] invaders = Martian.invade(13);
//        for (Martian invader : invaders) {
//            System.out.println(invader);
//        }

        Martian[] unknownInvaders = Martian.invade();
        for (Martian invader : unknownInvaders) {
            invader.doSomething();
        }
    }

    private static void test() {
        Martian martian = new Martian();
        System.out.println(martian);

        Martian[] martians = {new Martian(), new Martian(), new Martian()};

        for (Martian m : martians) {
            m.doSomething();
        }
    }

}
