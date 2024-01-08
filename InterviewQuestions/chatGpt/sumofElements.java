package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class sumofElements {
    public static void main(String[] args) {

        List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5);

        int sumofElements = arrList.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sumofElements);

    }
}
