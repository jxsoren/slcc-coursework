import java.util.Random;

public class Drawing {
    private Line[] lines;

    public Drawing(Line[] lines) {
        this.lines = lines;
    }

    public Drawing() {
        this.lines = new Line[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int x1 = random.nextInt(26);
            int y1 = random.nextInt(26);

            int x2 = random.nextInt(26);
            int y2 = random.nextInt(26);

            Point startingPoint = new Point(x1, y1);
            Point endingPoint = new Point(x2, y2);

            Line newLine = new Line(startingPoint, endingPoint);

            lines[i] = newLine;
        }

    }

    public void draw() {
        StdDraw.setXscale(0, 25);
        StdDraw.setYscale(0, 25);

        StdDraw.clear();

        for (Line line : lines) {
            line.draw();
        }

    }

}