package default_method;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        ArrayList<employee> emplist = new ArrayList<>();
        emplist.add(new employee("arjun", 20000));
        emplist.add(new employee("mahesh", 40000));
        emplist.add(new employee("kartik", 60000));
        emplist.add(new employee("vishnu", 100000));

        Predicate<employee> p1 = e -> e.salary > 50000;

        for (employee e : emplist) {

            if (p1.test(e))
                System.out.println(e.name + " " + e.salary);

        }
    }
}
