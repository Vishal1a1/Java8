import java.util.ArrayList;
import java.util.function.BiConsumer;

import default_method.employee;

public class BiConsumerFI {
    
    public static void main(String[] args) {
        ArrayList<employee> emplist = new ArrayList<>();
        BiConsumer<employee,Integer> bc = (e,b) -> e.salary = e.salary+b;

        emplist.add(new employee("Rakesh", 40000));
        emplist.add(new employee("Smith", 60000));
        emplist.add(new employee("John", 50000));
        emplist.add(new employee("Jack", 70000));

        for (employee e : emplist){
            bc.accept(e, 500);
            System.out.println(e.name+" "+e.salary);
        }



        
    }
}