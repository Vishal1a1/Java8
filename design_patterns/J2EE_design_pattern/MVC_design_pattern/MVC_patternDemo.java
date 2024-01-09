package design_patterns.J2EE_design_pattern.MVC_design_pattern;

public class MVC_patternDemo {
    public static void main(String[] args) {
        
        student model =  retrieveDatafromDatabase();
       
        studentView view = new studentView();

        studentContoller controller = new studentContoller(model, view);

        controller.updateStudentView();

        //update Model data
        model.setName("Raju");

        //update View
        controller.updateStudentView();


    }

    private static student retrieveDatafromDatabase() {
        student stud = new student("Arun",23);
        return stud;

    }
}
