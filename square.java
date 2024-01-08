import java.util.function.Function;
import java.util.function.Predicate;

class square{

    public static int squareInt(int n){
        return n*n;
    }
    public static void main(String[] args) {

        //Using squareInt method
        System.out.println("The sqaure of 4 "+squareInt(40));
        System.out.println("The square of 5 "+squareInt(50));
        
        //Using Function
        Function<Integer, Integer> f = i->i*i;
        System.out.println("The sqaure of 4 "+f.apply(40));
        System.out.println("The square of 5 "+f.apply(50));
    
        //Check even or odd  using Predicate
        Predicate<Integer> p =i->i%2==0;
        System.out.println(p.test(4));
        System.out.println(p.test(5));
        
    }
}