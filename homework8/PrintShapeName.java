package homework8;

public class PrintShapeName {
    static Shape circle = new Circle();
    static Shape triangle = new Triangle();
    static Shape square = new Square();
    static Shape rectangle = new Rectangle();
    static Shape pentagon = new Pentagon();
    public void printShape(Shape shape) {
        System.out.println(shape.getShapeName());
    }
    public static void main(String[] args) {
        PrintShapeName print = new PrintShapeName();
        print.printShape(circle);
        print.printShape(triangle);
        print.printShape(square);
        print.printShape(rectangle);
        print.printShape(pentagon);
    }



}
