package InterviewQuestions;

import java.util.Comparator;
import java.util.List;

public class sortEmployee_Java8 {
    public static void main(String[] args) {

        List<employee> empList = employee.createEmpList();

        System.out.println("Before sorting");

        empList.forEach(emp -> System.out.println(emp.getName() + "-" + emp.getCity()));

        // Sort employee using Java8
        empList.sort(Comparator.comparing(employee::getName));

        System.out.println("\nAfter sorting");

        empList.forEach(emp -> System.out.println(emp.getName() + "-" + emp.getCity()));

        //dual sort

        empList.sort(Comparator.comparing(employee::getCity));

        System.out.println("\nDual sorting");

        empList.forEach(emp -> System.out.println(emp.getName() + "-" + emp.getCity()));

        
        // Reverse Sorting using Java8
        empList.sort(Comparator.comparing(employee::getName).reversed());

        System.out.println("\nReverse sorting");

        empList.forEach(emp -> System.out.println(emp.getName() + "-" + emp.getCity()));

        // New Comparator - groupBy comparator 

        Comparator<employee> groupByComparator = Comparator.comparing(employee::getName).thenComparing(employee::getCity);

        empList.sort(groupByComparator);

        System.out.println("\nGroupBy sorting");

        empList.forEach(emp -> System.out.println(emp.getName() + "-" + emp.getCity()));


    }
}
