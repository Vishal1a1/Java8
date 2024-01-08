import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collections {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(25);
        arrayList.add(15);
        arrayList.add(50);
        System.out.println(arrayList);
        Comparator<Integer> c = (i1,i2) -> {
            return i1<i2? -1 : i1>i2 ? 1 : 0;
        };

        // OR 

        // Comparator<Integer> c = (i1,i2) -> i1<i2? -1 : i1>i2 ? 1 : 0;

        Collections.sort(arrayList, c);
        System.out.println(arrayList);
    }
}
