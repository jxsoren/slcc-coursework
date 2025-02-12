public class Ball {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double s) {
        if (s >= 0) {
            size = s;
        } else {
            size = 0;
        }
    }

    public void roll() {
        System.out.println("rolling . . .");
    }

    public void bounce(int numberOfBounces) {
        if (numberOfBounces > 1) {
            System.out.printf("bouncing %d times%n", numberOfBounces);
        } else {
            System.out.printf("bouncing %d time%n", numberOfBounces);
        }
    }

}
