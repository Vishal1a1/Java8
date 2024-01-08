package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class checkAnyMatch {
    private static boolean result;

    public static void main(String[] args) {
        List<Integer> arList = Arrays.asList(1,2,3,4,5);

        result = arList.stream().anyMatch(x-> x%3==0);

        System.out.println(result);
    }
}
