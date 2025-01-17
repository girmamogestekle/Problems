package stream.api.problems.com;

import java.util.*;
import java.util.stream.Collectors;

public class Question1 implements Solution{

    private Map<Character, List<String>> groupByFirstCharacter = new HashMap<>();
    List<String> words = new ArrayList<>();

    @Override
    public void solution() {
        System.out.println("Question 1: Group words by there first character?");
        groupByFirstCharacter = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
    }

    @Override
    public void display(List<String> inputWords) {
        words.addAll(inputWords);
        solution();
        System.out.println(groupByFirstCharacter.toString());
    }

}
