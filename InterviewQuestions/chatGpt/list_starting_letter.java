package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;

public class list_starting_letter {
    
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Apple", "Banana", "Orange", "Guava", "Grapes");

        strList.stream()
                .filter(s -> s.startsWith("G"))
                .forEach(x -> System.out.print(x+ " "));
    }
}
