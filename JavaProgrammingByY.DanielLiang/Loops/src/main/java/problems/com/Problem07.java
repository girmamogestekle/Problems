package problems.com;

import java.util.Scanner;

public class Problem07 implements Solution {

    private Scanner input = new Scanner(System.in);
    private int input01;
    private int input02;

    @Override
    public void solution() {
        if(input01 < input02){
            for(int i=input01; i>=1; i--){
                if(input02%i==0 && input01%i==0){
                    System.out.println("The Greatest Common Divisor for " + input01 + " and " + input02 + " is " + i + ".");
                    break;
                }
            }
        } else{
            for(int i=input02; i>=1; i--){
                if(input02%i==0 && input01%i==0){
                    System.out.println("The Greatest Common Divisor for " + input01 + " and " + input02 + " is " + i + ".");
                    break;
                }
            }
        }
    }

    @Override
    public void display() {
        System.out.println("Enter the first number");
        input01 = input.nextInt();
        System.out.println("Enter the second number");
        input02 = input.nextInt();
        solution();
    }

}
