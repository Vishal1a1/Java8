package InterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List_to_Map_using_groupingBy {
    public static void main(String[] args) {
        List<employee> empList = employee.createEmpList();

        Map<String, List<employee>> empMap = 
        empList.stream().collect(Collectors.groupingBy(employee::getCity));

        empMap.forEach(
            (key, Value) -> System.out.println("City "+key+" Value: "+Value)
        );
    }
}
