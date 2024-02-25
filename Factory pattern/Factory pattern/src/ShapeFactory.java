public class ShapeFactory {

    public Shape createShape(String shape){
        switch (shape) {
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
        }
        return null;
    } 
    
}
