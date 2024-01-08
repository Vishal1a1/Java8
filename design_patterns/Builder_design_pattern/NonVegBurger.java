package design_patterns.Builder_design_pattern;

public class NonVegBurger extends Burger {

    @Override
    public String name() {
       return "Non-Veg Burger";
    }

    @Override
    public float price() {
       return 50.0f;
    }
    
}
