package design_patterns.AbstractFactory_design;

public class main {
    public static void main(String[] args) {

        abstractFactory shapeFactory = FactoryProducer.createObject("SHAPE");

        abstractFactory colorFactory = FactoryProducer.createObject("COLOR");

        shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.calculateArea();

        shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.calculateArea();

        shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.calculateArea();


        color red = colorFactory.getColor("RED");
        red.fill();

        color green = colorFactory.getColor("GREEN");
        green.fill();

        color yellow = colorFactory.getColor("YELLOW");
        yellow.fill();
    }
}
