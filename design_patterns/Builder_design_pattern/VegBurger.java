package design_patterns.Builder_design_pattern;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 35.0f;
    }
    
}
