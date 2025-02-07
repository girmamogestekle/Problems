package leet.code.problems.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question136 implements Solution{

    private int uniqueNumber;

    @Override
    public void solution() {
        System.out.println("Question 136: Single Number?");
        int[] nums = {4,1,2,1,2};
        System.out.println("The input is " + Arrays.toString(nums));
        Map<Integer, Integer> uniquePairs = new HashMap<>();
        for (int num : nums) {
            if (uniquePairs.containsKey(num)) uniquePairs.remove(num);
            else uniquePairs.put(num, num);
        }
        uniqueNumber = uniquePairs.keySet().stream().findFirst().orElse(0);
    }

    @Override
    public void display() {
        solution();
        System.out.println("The unique number is " + uniqueNumber);
    }
}
