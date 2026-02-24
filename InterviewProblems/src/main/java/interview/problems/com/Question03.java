package interview.problems.com;

import java.util.HashMap;
import java.util.Map;

public class Question03 implements Solution {

    private int count = 0;
    private Map<Integer, String> mapCountValueWithInput = new HashMap<>();

    @Override
    public void solution() {
        System.out.println("Question 03: Write a program to Identify most repeated word from a list");
        String[] input = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil" };
        Map<String, Integer> mapInputWithCountValue = new HashMap<>();

        for(int i = 0; i < input.length; i++) {
            int temp = mapInputWithCountValue.getOrDefault(input[i], 0) + 1;
            if(temp > count) count  = temp;
            mapInputWithCountValue.put(input[i], temp);
            mapCountValueWithInput.put(temp, input[i]);
        }
    }

    @Override
    public void display() {
        System.out.println("Most Frequent Element : " + mapCountValueWithInput.get(count));
        System.out.println("Count : " + count);
    }
}
