package leet.code.problems.com;

import java.util.Arrays;

public class Question3432 implements Solution{

    private int countEven;

    @Override
    public void solution() {
        System.out.println("Question 3432: Count partitions with even sum difference?");
        int[] nums = {10, 10, 3, 7, 6};
        int leftSum = nums[0];
        int rightSum = Arrays.stream(nums).reduce(0, Integer::sum) - leftSum;
        countEven = (leftSum - rightSum)%2 == 0? 1 : 0;
        int i=1;
        while(i<nums.length-1){
            leftSum += nums[i];
            rightSum -= nums[i];
            if((leftSum - rightSum)%2 == 0) countEven+=1;
            i++;
        }
    }

    @Override
    public void display() {
        solution();
        System.out.println("There is " + countEven + " even numbers");
    }
}
