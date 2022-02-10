interface Shape{
    public void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("This is RECTANGLE");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("This is SQUARE");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("This is CIRCLE");
    }
}

class ObjectFactory {
    public Shape getShape(String shapeName){
        if(shapeName == null){
            return null;
        }
        else if(shapeName.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeName.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeName.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else{return null;}
    }
}

public class FactoryPatternDemo{
    public static void main(String args[]){
        ObjectFactory objectFactory = new ObjectFactory();

        Shape shapeRectangle = objectFactory.getShape("rectangle");
        Shape shapeSquare =  objectFactory.getShape("square");
        Shape shapeCircle =  objectFactory.getShape("circle");

        shapeRectangle.draw();
        shapeSquare.draw();
        shapeCircle.draw();
    
    }
}
