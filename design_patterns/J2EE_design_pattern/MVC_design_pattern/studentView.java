package design_patterns.J2EE_design_pattern.MVC_design_pattern;

public class studentView {
    
    void printStudentDetails(student stud){
        System.out.println("Student details : ");
        System.out.println("Student Name: "+stud.getName());
        System.out.println("Student Roll No: "+stud.getRollNo());
    }
}
