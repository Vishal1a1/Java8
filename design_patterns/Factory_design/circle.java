package design_patterns.Factory_design;

public class circle implements shape {

    @Override
    public void calculateArea() {
        System.out.println("Area of circle is 3.14*r*r");
    }
    
}
