package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class average {
    public static void main(String[] args) {

        List<Integer> arList = Arrays.asList(1, 2, 3, 4, 5, 6);

        double avg = arList.stream().mapToInt(Integer::intValue).average().orElseThrow();

        System.out.println(avg);

    }
}
