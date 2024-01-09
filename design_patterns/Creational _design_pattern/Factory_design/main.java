package design_patterns.Factory_design;

public class main {
    public static void main(String[] args) {
        shapeFactory ob =  new shapeFactory();

        shape shape1 = ob.getShape("CIRCLE");
        shape1.calculateArea();

        shape shape2 = ob.getShape("SQUARE");
        shape2.calculateArea();

        shape shape3 = ob.getShape("RECTANGLE");
        shape3.calculateArea();
    }
}
