package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class reuseStream {
    public static void main(String[] args) {

Integer[] arr = { 1, 2, 3, 4, 5 };
List<Integer> arrList = Arrays.asList(arr);

Supplier<Integer> result = () -> arrList.stream().reduce((a, b) -> a + b).get();
System.out.println(result.get());
    }
}
