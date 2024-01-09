package design_patterns.Builder_design_pattern;

public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 40.0f;
    }
    
}
