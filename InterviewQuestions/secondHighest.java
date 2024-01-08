package InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondHighest {
    public static void main(String[] args) {
        
List<Integer> arrList = Arrays.asList(1,2,2,3,4,9,6,0,10, 5);
Integer result = arrList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
Integer secondHighest = arrList.stream().filter(x -> x<result).max((i1,i2) -> i1.compareTo(i2)).get();


//Alternative
Integer secondHighest2 =  arrList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
System.out.println(secondHighest+" : "+secondHighest2);


    }

}
