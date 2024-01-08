package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class mulitpleElementsofanArray {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arrList = Arrays.asList(arr);
        
        Optional<Integer> result = arrList.stream().reduce((a,b)-> a*b);

        if(result.isPresent()){
            System.out.println("Array multiplication "+result.get());
        }
        else{
            System.out.println("List/Array is empty");
        }
    }
}
