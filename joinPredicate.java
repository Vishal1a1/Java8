import java.util.function.Predicate;

public class joinPredicate {
    
    public static void main(String[] args) {
        
        int arr [] = {2, 3, 4, 5, 6, 7, 8};

        Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2 = i->i>5;

        for(int value : arr){

            if(p1.and(p2).test(value))
                System.out.println(value);

            if(p1.or(p2).test(value))
                System.out.println(value);

            if(p1.negate().test(value))
                System.out.println(value);
        }
        
    }
}
