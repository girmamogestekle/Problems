package problems.com;

import java.util.Scanner;

public class Problem02 implements Solution {

    int randomNumberOne;
    int randomNumberTwo;
    int countCorrectAnswers = 0;
    Scanner scanner = new Scanner(System.in);
    int countQuestion = 1;
    int answer;
    long startTime = System.currentTimeMillis();

    @Override
    public void solution() {
        while (countQuestion <= 5) {
            System.out.println("Guessing " + countQuestion + " round random question numbers");
            assigningRandomNumbers();

            int temp;
            if(randomNumberOne < randomNumberTwo) {
                temp = randomNumberTwo;
                randomNumberTwo = randomNumberOne;
                randomNumberOne = temp;
            }

            System.out.println("Random Number One: " + randomNumberOne);
            System.out.println("Random Number Two: " + randomNumberTwo);
            System.out.println("What is the subtract from " + randomNumberOne + " with " + randomNumberTwo);

            answer = scanner.nextInt();
            if(answer == (randomNumberOne-randomNumberTwo)) {
                System.out.println("Yes, you got the subtraction guessing number");
                countCorrectAnswers++;
            }else{
                System.out.println("No, you don't got the subtraction guessing number");
            }
            countQuestion++;
            System.out.println();
        }
    }

    @Override
    public void display() {
        solution();
        long endTime = System.currentTimeMillis();

        System.out.println("You got " + countCorrectAnswers + " correct answers, and " +
                "You missed " + ((countQuestion - countCorrectAnswers)-1) + " questions");

        System.out.println("Total Spent Time: " + (endTime - startTime) + " ms");

    }

    private void assigningRandomNumbers() {
        randomNumberOne = (int) (Math.random() * 100);
        randomNumberTwo = (int) (Math.random() * 100);
    }
}
