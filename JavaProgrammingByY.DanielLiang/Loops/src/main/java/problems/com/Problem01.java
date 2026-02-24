package problems.com;

import java.util.Random;
import java.util.Scanner;

public class Problem01 implements Solution{

    Scanner scanner = new Scanner(System.in);
    int input;

    @Override
    public void solution() {
        boolean isGuessingCorrect = true;
        int guessingNumber = new Random().nextInt(100);

        while(isGuessingCorrect) {
            if(input == guessingNumber) {
                System.out.println("Yes, the number is " + input);
                isGuessingCorrect = false;
            } else if(input > guessingNumber) {
                System.out.println("Your guess is too high. Try again.");
                System.out.println("Enter your guessing number again?");
                input = scanner.nextInt();
            } else{
                System.out.println("Your guess is too low. Try again.");
                System.out.println("Enter your guessing number again?");
                input = scanner.nextInt();
            }
        }
    }

    @Override
    public void display() {
        System.out.println("Enter your guessing number?");
        input = scanner.nextInt();
        solution();
    }
}
