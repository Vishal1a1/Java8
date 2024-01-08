package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurenceEachElement {
    private static Map<String, Long> collect;

    public static void main(String[] args) {
        
        List<String> arList = Arrays.asList("Apple","Banana","Orange",
                                            "Grapes","Banana","Apple","Grapes");
        collect = arList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

}
