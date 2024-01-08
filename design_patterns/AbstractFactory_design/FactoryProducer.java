package design_patterns.AbstractFactory_design;

public class FactoryProducer{
     
    public static abstractFactory createObject(String object){
        if (object.equals("SHAPE"))
            return new shapeFactory();
        else if(object.equals("COLOR"))
            return new colorFactory();
        return null;
    }
}