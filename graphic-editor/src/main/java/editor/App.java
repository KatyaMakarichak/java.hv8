package editor;

import editor.shape.*;
import editor.utils.ShapePrinter;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(),
            new Square(),
            new Rectangle(),
            new Triangle(),
            new Ellipse()
        };

        ShapePrinter printer = new ShapePrinter();
        for (Shape shape : shapes) {
            printer.printShapeName(shape);
        }
    }
}
