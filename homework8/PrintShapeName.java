package homework8;

public class PrintShapeName {
    static Shape circle = new Circle();
    static Shape triangle = new Triangle();
    static Shape square = new Square();
    static Shape rectangle = new Rectangle();
    static Shape pentagon = new Pentagon();

    public static void main(String[] args) {
        circle.printShapeName();
        triangle.printShapeName();
        square.printShapeName();
        rectangle.printShapeName();
        pentagon.printShapeName();
    }

}
