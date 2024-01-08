package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class UpperCaseUsingMap {
    public static void main(String[] args) {
        
        List<String> strList = Arrays.asList("antony", "austin", "anthony", "bunny");

        strList.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
