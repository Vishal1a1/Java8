package design_patterns.Factory_design;

public class rectangle implements shape {

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle is length*breadth");
    }
    
}
