package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


public class maxElement {
    public static void main(String[] args) {
        
        List<Integer> arrList = Arrays.asList();
        
        int max = arrList.stream().max((i1,i2) -> i1.compareTo(i2)).get();

        // OR

        int max2 = arrList.stream().max(Integer::compareTo).orElseThrow(NoSuchElementException::new);

        System.out.println(max2);

    }
}
