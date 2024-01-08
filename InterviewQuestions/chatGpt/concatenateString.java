package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class concatenateListintoString {
    private static String collect;

    public static void main(String[] args) {

        List<String> arList = Arrays.asList("Apple","Banana","Grapes","Guava","Orange");
        collect = arList.stream().collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}