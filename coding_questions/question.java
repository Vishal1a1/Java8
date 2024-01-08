package coding_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * question
 */
public class question {

    public static void main(String[] args) {
        

        Employee employee;

        List<Employee> empList =  new ArrayList<>();
        List<Employee> empList2 =  new ArrayList<>();

        int ar[]  = {1,2,3,4,5};
        int ar2[] = {4,5,6,7,8};

        // empList2 = empList.stream().filter(x -> x.getExperince()>4).collect(Collectors.toList());

        List<Integer> ar1 = Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        // for(int e : ar1)
        //     System.out.println(e);

         List<Integer> ar4 = Arrays.stream(ar).filter(n -> Arrays.stream(ar2).anyMatch(n2 -> n2==n)).boxed().collect(Collectors.toList());
         for(int e : ar4)
            System.out.println(e);

        String str[] = {"Apples","Mangoes", "Orange", "Guava", "Pomgranate"};

        int len = Arrays.stream(str).mapToInt(n -> n.length()).max().orElse(0);
        System.out.println("Length of longest string "+len);
    }
}