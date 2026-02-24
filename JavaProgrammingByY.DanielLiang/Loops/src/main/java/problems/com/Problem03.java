package problems.com;

import java.util.Scanner;

public class Problem03 implements Solution {

    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    @Override
    public void solution() {
        System.out.println("Enter any number of data except zero?");
        int data = scanner.nextInt();

        while (data != 0) {
            sum += data;
            data--;
        }

    }

    @Override
    public void display() {
        solution();
        System.out.println("The sum is " + sum);
    }

}
