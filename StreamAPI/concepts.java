package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.event.SwingPropertyChangeSupport;

import default_method.employee;

class concepts {
    private static Object[] array;

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(28);
        arr.add(35);
        arr.add(47);
        arr.add(52);

        // print list of elements using forEach
        // for(int i : arr)
        //     System.out.println(i);

        // print list of elements using stream
        // arr.stream().forEach(x -> System.out.println(x));

        // filter even numbers from stream
        // arr.stream().filter(x->x%2==0).forEach(x -> System.out.println(x));

        // square of each element in arraylist
        // arr.stream().map(x->x*x).forEach(X->System.out.println(X));

        // List<Integer> arrList  = new ArrayList<>(); 	
	    // arrList = arr.stream().filter(x->x%2==0).map(x->x*2).collect(Collectors.toList());
        // arrList.stream().forEach(x -> System.out.println(x));

        // int count = (int)arrList.stream().count();
        // System.out.println(count);

        // arr.stream().sorted().forEach(x->System.out.println(x));

        // in descending order
        // arr.stream().sorted((i1,i2) -> i2.compareTo(i1))
        // .forEach(x->System.out.println(x));

        // int max =  arr.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        // System.out.println(max);

        // int min =  arr.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        // System.out.println(min);

        // Object[] array = arr.stream().filter(x->x%2==0).toArray();
        // Integer[] intarr = Arrays.stream(array).map(o -> (Integer)o).toArray(Integer[]::new);
        // for(int i=0;i<intarr.length;i++)
        // {
        //         intarr[i] = intarr[i] + 10;
        // }

        // for(int value : intarr)
        //     System.out.print(value + " ");
        // System.out.println();
        
        // Stream.of(1,12,13,13,"Alpha",'c')
        //                 .forEach(x->System.out.println(x));

        // String[] name  = {"Smith","John", "Jack"};
        // Stream.of(name).sorted().forEach(x->System.err.println(x));

        // intermediate operations are lazy loaded
        // List<Employee> empList = new ArrayList<>();
        // empList.add(new Employee(101, "Smith"));
        // empList.add(new Employee(102, "John"));
        // empList.add(new Employee(103, "Jay"));
        // empList.add(new Employee(104, "Jack"));

        // Stream s  = empList.stream().filter(x -> x.eno > 102).map( x -> {
        // x.printname();
        // return x.name;
        // }
        // );

        // s.forEach(x->System.out.println(x));

        // arr.stream().filter(x->x%2==0).peek(x->System.out.println(x)).count();
        
        int sum = 0;
        for(int i=0;i<5;i++)
            sum = sum + arr.get(i);
        System.out.println(sum);

        System.out.println(arr.stream().reduce((a,b) -> a+b).get());
        

    }
}