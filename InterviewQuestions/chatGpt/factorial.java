package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class factorial {

    public static void main(String[] args) {

        List<Integer> arList = Arrays.asList(1, 2, 3, 4, 5);
        
        int factorial = arList.stream().reduce(1, (a, b) -> (a * b));

        System.out.println(factorial);

    }
}
