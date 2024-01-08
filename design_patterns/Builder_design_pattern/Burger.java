package design_patterns.Builder_design_pattern;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new paperWrap();
    }

}
