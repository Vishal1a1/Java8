import java.util.function.Function;
import java.util.function.Predicate;   
class   functionFI{
public static void main(String[] args) {

        //square of a number
        Function<Integer,Integer> f1 = i->i*i;
        System.out.println(f1.apply(5));

        //length of a string
        Function<String,Integer> f2= s->s.length();
        System.out.println(f2.apply("Aeroplane"));

        //string to UpperCASE
        Function <String,String> f3 = s->s.toUpperCase();
        System.out.println(f3.apply("Workspace"));

        /*
        Grades for a student in an exam
         * >=80 - A
         * >=60 - B
         * >=50 - C
         * >=40 - D
         * <40  - E
         */
         
        // calculate grade for students
        Function<Student,Character> f4 = s->s.marks>=80 ? 'A' : s.marks>=60 ? 'B' : s.marks>=50 ? 'C' : s.marks>=40 ? 'D' : 'E';
        Student s[]= {
            new Student("Sameer", 70),
            new Student("Rakesh", 80),
            new Student("Aman", 50),
            new Student("Puneet", 35)
        };
        
        char grade =' ';

        for(Student s1 : s){
            grade = f4.apply(s1);
            System.out.println("Student Name : "+s1.name);
            System.out.println("Student Marks : "+s1.marks);
            System.out.println("Student Grade : "+grade);
            System.out.println();
        }

        Predicate<Student> p1 = str->str.marks>=60;
        for(Student s1 : s){
            if (p1.test(s1)){
                System.out.println("Student Name : "+s1.name);
                System.out.println("Student Marks : "+s1.marks);
                System.out.println("Student Grade : "+f4.apply(s1));
                System.out.println();
            }
        }

        //Function chaining

        Function<Integer,Integer> f5 = i->i*2;
        Function<Integer,Integer> f6 = n->n*n*n;

        System.out.println("And then : "+f5.andThen(f6).apply(2));
        System.out.println("Compose : "+f5.compose(f6).apply(2));

        
    }
}
