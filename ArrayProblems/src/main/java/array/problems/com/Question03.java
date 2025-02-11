package array.problems.com;

import java.util.Arrays;

public class Question03 implements Solution {

    private int[] firstSecondScores = new int[2];

    @Override
    public void solution() {
        System.out.println("Question 3: Given an array, write a function to get first, second best scores from the array and return it in new array.");
        int[] inputs = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println("The inputs are: " + Arrays.toString(inputs));
        int firstScore = Integer.MIN_VALUE, secondScore = Integer.MIN_VALUE;
        for(int input : inputs) {
            if(input>firstScore){
                secondScore = firstScore;
                firstScore = input;
            }
        }
        firstSecondScores[0] = firstScore;
        firstSecondScores[1] = secondScore;
    }

    @Override
    public void display() {
        solution();
        System.out.println("The first and second scores are " + Arrays.toString(firstSecondScores));
    }
}
