package design_patterns.Builder_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotalCost() {
        float totalCost = 0.0f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println("Item Name : " +item.name() + " Packing : " + item.packing().pack() 
            + " Price : " +item.price());
        }
    }

}
