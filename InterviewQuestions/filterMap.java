package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class filterMap {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};

        List<Integer> arrList = Arrays.asList(arr);

    System.out.println("Filter even numbers: ");
    arrList.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x + " "));

    System.out.println("Sqaure numbers");
    arrList.stream().map(x -> x*x).forEach(x -> System.out.println(x));


    }
}
