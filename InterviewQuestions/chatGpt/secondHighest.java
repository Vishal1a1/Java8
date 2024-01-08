package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class secondHighest {
    private static Optional<Integer> secondHigh;

    public static void main(String[] args) {
        
        List<Integer> arList = Arrays.asList(150,200,36,40,5);
        secondHigh = arList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        if (secondHigh.isPresent())
            System.out.println(secondHigh.get());

    }
}
