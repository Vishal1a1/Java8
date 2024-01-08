package coding_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class demo {
    
    static int square(int n ){
        return n*n;
    }

    public static void main(String[] args) {
        int result  = square(5);
        // System.out.println("result = "+result);

        List<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(12);
        arrList.add(15);
        arrList.add(18);

        // for(int n : arrList) System.out.println(n*n);

        // arrList.stream().map(n -> n*n).forEach(n -> System.out.println(n));

        // Function<Integer,Integer> fun1 = n -> n*n;

        // int sum = arrList.stream().reduce((a,b) -> a+b).get();

        // System.out.println(sum);

        arrList.stream().filter(n -> n>12).forEach(n -> System.out.println(n));

        // System.out.println(fun1.apply(5));
        
    }



}
