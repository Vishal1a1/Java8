package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class averageLength_String {

    public static void main(String[] args) {

        List<String> arList = Arrays.asList("Apple", "Banana", "Coconut", "Graphes", "Guava");
        double average = arList.stream().mapToInt(String::length).average().orElseThrow();
        System.out.println(average);

    }
}
