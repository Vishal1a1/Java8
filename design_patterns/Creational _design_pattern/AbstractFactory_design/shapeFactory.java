package design_patterns.AbstractFactory_design;

public class shapeFactory extends abstractFactory{

    @Override
    public color getColor(String color) {
        return null;
    }

    @Override
    public shape getShape(String shape) {
        if (shape == "CIRCLE")
            return new circle();
        else if (shape.equals("SQUARE"))
            return new square();
        else if(shape.equals("RECTANGLE"))
            return new rectangle();
        else
            return null;
    }
}
