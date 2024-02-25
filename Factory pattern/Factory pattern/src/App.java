public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.createShape("square");
        square.draw();
    }
}
