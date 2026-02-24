package array.problems.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question01 implements Solution {

    private int[] output;

    @Override
    public void solution() {
        System.out.println("Question 1: Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.");
        int[] input = {1,2,4,3, 5, 7, 8};
        output = new int[input.length-2];
        System.out.println("The inputs are: " + Arrays.toString(input));
        System.arraycopy(input, 1, output, 0, output.length);

    }

    @Override
    public void display() {
        solution();
        System.out.println("The middle array is " + Arrays.toString(output));
    }

}
