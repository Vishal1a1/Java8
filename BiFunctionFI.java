import java.util.ArrayList;
import java.util.function.BiFunction;

class BiFuncctionFI {

    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();
        BiFunction<Integer, String, Employee> bf = (eno, name) -> new Employee(eno, name);
        emp.add(bf.apply(101, "Smith"));
        emp.add(bf.apply(102, "John"));
        emp.add(bf.apply(103, "Nancy"));
        emp.add(bf.apply(104, "Jay"));

        for(Employee e : emp)
            System.out.println(e.eno+" "+e.name);
    }
}
