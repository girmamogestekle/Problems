package stream.api.problems.com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question2 implements Solution{

    Map<String, Long> topWords;

    @Override
    public void solution() {
        System.out.println("Question 2: Find Top N Frequent Words in a Paragraph?");
        String paragraph = "java java spring boot spring boot spring java streams boot boot";
        int n = 2;
        topWords = Arrays.stream(paragraph.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(n)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    @Override
    public void display() {
        solution();
        System.out.println(topWords.toString());
    }


}
