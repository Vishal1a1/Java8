package design_patterns.J2EE_design_pattern.MVC_design_pattern;

public class studentContoller {
    private student model;
    private studentView view;

    public studentContoller(student model, studentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(int rollNo){
        model.setRollNo(rollNo);
    }

    public int getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateStudentView(){
        view.printStudentDetails(model);
    }
}
