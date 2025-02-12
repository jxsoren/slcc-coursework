public class BallApp {
    public static void main(String[] args) {
        Ball myBall = new Ball();
        myBall.setSize(5);

        System.out.printf("Ball with size %.0f%n", myBall.getSize());
        myBall.roll();
        myBall.bounce(14);
        myBall.setSize(7);
        System.out.printf("size: %.0f", myBall.getSize());
    }
}
