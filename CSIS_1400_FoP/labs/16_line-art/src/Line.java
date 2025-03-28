public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public void draw() {
        StdDraw.line(start.getX(), start.getY(), end.getX(), end.getY());
    }


}