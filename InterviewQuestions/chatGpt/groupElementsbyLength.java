package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupElementsbyLength {
    private static Map<Integer, List<String>> collect;

    public static void main(String[] args) {
        
        List<String> arList = Arrays.asList("Apple","Mango","Orange","Guava","Graphes");
        
        collect = arList.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

    }
}
