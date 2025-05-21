package editor;

public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape[] shapes = {
            new Circle(),
            new Rectangle(),
            new Triangle(),
            new Ellipse(),
            new Square()
        };

        for (Shape shape : shapes) {
            printer.printShapeName(shape);
        }
    }
}
