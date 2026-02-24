package array.problems.com;

import java.util.Arrays;

public class Main {

    private static Menu menu = new Menu();

    public static void main(String[] args) {
        menu.questionSelect();
        long countNotSelectedQuestions = menu.sizeNotSelectedQuestions();
        boolean doMoreQuestions = menu.doMoreQuestions();
        while (countNotSelectedQuestions!=0 && doMoreQuestions) {
            System.out.println();
            System.out.println();
            menu.questionDisplay();
            System.out.println("Enter the question number");
            menu.questionSelect();
            countNotSelectedQuestions = menu.sizeNotSelectedQuestions();
            if(countNotSelectedQuestions==0) {
                System.out.println("=================================================");
                System.out.println("=================================================");
                System.out.println("You don't have any more questions!!! 😊😊😊");
                System.out.println("Thank You !!!");
                break;
            }
            doMoreQuestions = menu.doMoreQuestions();
        }

    }

}