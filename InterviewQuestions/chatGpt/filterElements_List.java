package InterviewQuestions.chatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterElements_List {
    private static List<Integer> collect;

    public static void main(String[] args) {
        List<Integer> arList = Arrays.asList(1,2,3,4,5);

        collect = arList.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
