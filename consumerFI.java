import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class consumerFI {

    public static void main(String[] args) {

        Function<Student,Character> f4 = s->s.marks>=80 ? 'A' : s.marks>=60 ? 'B' : s.marks>=50 ? 'C' : s.marks>=40 ? 'D' : 'E';

        Student arr[] = {
                new Student("Ajay", 40),
                new Student("Vikram", 60),
                new Student("William", 80),
                new Student("John", 100)
        };

        Predicate<Student> p1 = s->s.marks>=60;

        Consumer<Student> c2 = s -> System.out.println("Student  Name : "+s.name + "Marks : " + s.marks+"Grade : "+f4.apply(s));

        for (Student s1 : arr) {
            if (p1.test(s1))
                c2.accept(s1);
        }

    }
}