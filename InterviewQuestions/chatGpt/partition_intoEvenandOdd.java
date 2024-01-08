package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partition_intoEvenandOdd {;

    public static void main(String[] args) {
        
        List<Integer> arList = Arrays.asList(1,2,3,4,5);
        Map<Boolean, List<Integer>> partition = arList.stream().collect(Collectors.partitioningBy(x -> x%2==0));
        
        System.out.println(partition.get(true));
        System.out.println(partition.get(false));
    }
}
