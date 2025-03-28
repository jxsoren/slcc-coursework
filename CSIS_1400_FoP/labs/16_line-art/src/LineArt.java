public class LineArt {

    public static void main(String[] args) {

        Drawing myDrawing = new Drawing();

        myDrawing.draw();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        Line[] secondDrawingLines = {
                new Line(
                        new Point(1, 1),
                        new Point(1, 4)
                ),
                new Line(
                        new Point(4, 1),
                        new Point(4, 4)
                ),
                new Line(
                        new Point(4, 4),
                        new Point(1, 4)
                ),
                new Line(
                        new Point(4, 1),
                        new Point(1, 1)
                )
        };
        Drawing secondDrawing = new Drawing(secondDrawingLines);
        
        secondDrawing.draw();

    }

}