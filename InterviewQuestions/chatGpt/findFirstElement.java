package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class findFirstElement {
    private static Integer result;

    public static void main(String[] args) {

        List<Integer> arList = Arrays.asList(12,6,18,24);
        result = arList.stream().filter(x -> (x%2==0) && (x%3==0)).findFirst().orElseThrow();
        System.out.println(result);

    }
}
