package StreamAPI;

public class Employee {
    
    int eno;
    String name;

    Employee(int eno, String name){
        this.eno = eno;
        this.name = name;
    }

    public void printname(){
        System.out.println("Employee name "+this.name);
    }
}
