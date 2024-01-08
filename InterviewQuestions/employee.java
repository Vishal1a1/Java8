package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class employee {

    private int id;
    private String name;
    private String city;
    private int age;

    public employee(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age +"]";
    }

    public static List<employee> createEmpList(){
        List<employee> empList =  new ArrayList<>();
        empList.add(new employee(1, "Rakesh", "Pune",22));
        empList.add(new employee(2, "Rohit", "Mumbai",23));
        empList.add(new employee(3, "Raj", "Delhi",25));
        empList.add(new employee(4, "Ramesh", "Pune",28));
        empList.add(new employee(5, "Ram", "Tamil Nadu",29));
        return empList;
    }
}
