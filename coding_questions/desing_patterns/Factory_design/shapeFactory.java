package coding_questions.desing_patterns.Factory_design;

public class shapeFactory {
    
    public shape getShape(String input){
        if (input == "CIRCLE")
            return new circle();
        else if (input.equals("SQUARE"))
            return new square();
        else if(input.equals("RECTANGLE"))
            return new rectangle();
        else
            return null;
    }
}
