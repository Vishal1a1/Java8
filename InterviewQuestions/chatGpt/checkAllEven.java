package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class checkAllEven {
    public static void main(String[] args) {
        
        List<Integer> arList = Arrays.asList(1,2,3,4,5);
        
        boolean result = arList.stream().allMatch(x -> x%2==0);

        System.out.println("All even : "+result);
    }
}
