package interview.problems.com;

import java.util.*;

public class Question02 implements Solution{

    Map<Character, Integer> counts = new HashMap<>();

    @Override
    public void solution() {
        System.out.println("Question 2: Write a program to count the repeating characters in a string.");
        String input = "Wednesday";

        for(int i=0; i<input.length(); i++) counts.put(input.charAt(i), counts.getOrDefault(input.charAt(i), 0) + 1);

    }

    @Override
    public void display() {
        solution();

        counts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
