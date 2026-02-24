package array.problems.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello From Array Problems!");
        System.out.println("Test for github!");

        ZeroStriping obj = new ZeroStriping();
        int[][] test = {{1,2,3,4,5}, {6,0,8,9,10}, {11,12,13,14,15}, {16,17,18,19,0}};
        int[][] result = obj.zeroStrip(test);
        System.out.println(Arrays.deepToString(result));
    }
}