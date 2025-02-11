package leet.code.problems.com;

import java.util.Arrays;

public class Question217 implements Solution {

    private boolean isAppearTwice;

    @Override
    public void solution() {
        System.out.println("Question 217: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.");
        int[] nums = {1,2,3,1};
        System.out.println("The input is " + Arrays.toString(nums));
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                isAppearTwice = true;
                break;
            } else{
                isAppearTwice = false;
            }
        }
    }

    @Override
    public void display() {
        solution();
        System.out.println("Is any value appears at least twice? " + isAppearTwice);
    }
}
