package leet.code.problems.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question169 implements Solution{

    private int majorityElement;

    @Override
    public void solution() {
        System.out.println("Question 169: Majority Element?");
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("The input is " + Arrays.toString(nums));
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i=0; i<nums.length; i++) pairs.put(nums[i], pairs.getOrDefault(nums[i],0)+1);
        majorityElement =  pairs.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);
    }

    @Override
    public void display() {
        solution();
        System.out.println("The unique number is " + majorityElement);
    }
}
