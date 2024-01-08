package coding_questions;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, 23, "John", new Address("New York", 23));
        Employee e2 = new Employee(102, 28, "Smith", new Address("California", 21));
        Employee e3 = new Employee(103, 26, "Jack", new Address("Paris", 451));
        Employee e4 = new Employee(104, 21, "Zack", new Address("Boston", 73));

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        Collections.sort(empList, new AgeComparator());

        System.out.println(empList);

        System.out.println("******************************************");

        Collections.sort(empList, new NameComparator());

        System.out.println(empList);

        System.out.println("********************************************");

        Collections.sort(empList, new AddressComparator());

        System.out.println(empList);

    }
}
