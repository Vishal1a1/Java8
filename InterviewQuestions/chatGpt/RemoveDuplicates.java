package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,2,3,7,8);

        List<Integer> distinct = arrList.stream().distinct().collect(Collectors.toList());

        System.out.println(distinct);
        
    }
}
