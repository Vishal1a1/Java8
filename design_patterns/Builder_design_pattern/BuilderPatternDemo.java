package design_patterns.Builder_design_pattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.printItems();
        System.out.println("Total Cost: "+vegMeal.getTotalCost());


        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.printItems();
        System.out.println("Total Cost: "+nonVegMeal.getTotalCost());
    }
}
