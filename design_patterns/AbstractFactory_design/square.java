package design_patterns.AbstractFactory_design;

public class square implements shape{

    @Override
    public void calculateArea() {
       System.out.println("Area of square is side*side");
    }
    
}
