package Factory.practicalfactory;

interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("This is a square");
    }
}

class ShapeFactory {

    public static Shape getShape(String type) {
        if(type == "circle") {
            return new Circle();
        } else if(type == "square") {
            return new Square();
        }
        throw new RuntimeException("Unimplemented shape:" + type);
    }
}

public class client {
    public static void main(String[] args) {
    
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();
        shape = ShapeFactory.getShape("square");
        shape.draw();        
    }
}
