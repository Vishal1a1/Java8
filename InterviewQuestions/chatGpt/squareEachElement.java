package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class squareEachElement {
    
    private static List<Integer> collect;
    public static void main(String[] args) {

    List<Integer> arList = Arrays.asList(1,2,3,4,5);

    collect = arList.stream().map(x -> x*x).collect(Collectors.toList());
    
    System.out.println(collect);
    
    }

}
