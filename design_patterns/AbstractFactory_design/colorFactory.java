package design_patterns.AbstractFactory_design;

/**
 * colorFactory
 */
public class colorFactory extends abstractFactory{

    @Override
    public color getColor(String color) {
        if (color.equals(""))
            return null;
        else if(color.equals("RED"))
            return new red();
        else if(color.equals("GREEN"))
            return new green();
        else if(color.equals("YELLOW"))
            return new yellow();
        else
            return null;
    }

    @Override
    public shape getShape(String shape) {
        return null;
    }

    
}