package array.problems.com;

import java.util.Arrays;

public class Question02 implements Solution {

    private int sumDiagonalElements;

    @Override
    public void solution() {
        System.out.println("Question 2: Given 2D array calculate the sum of diagonal elements.");
        int[][] myArray2D = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("The inputs are: " + Arrays.toString(myArray2D));
        System.out.println("The inputs are: " + Arrays.deepToString(myArray2D));

        for(int row = 0; row < myArray2D.length; row++) {
            for(int col = 0; col < myArray2D[row].length; col++) {
                if(row == col || (row+col) == myArray2D.length-1) sumDiagonalElements += myArray2D[row][col];
            }
        }
    }

    @Override
    public void display() {
        solution();
        System.out.println("The diagonal sum is " + sumDiagonalElements);
    }

}
