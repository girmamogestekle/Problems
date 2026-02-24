package problems.com;

public class Main {

    private static Menu menu = new Menu();

    {
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("Your Selected Chapter 4: Loops.");
        System.out.println("Here is the problems. Have nice time 😊😊😊");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        menu.questionSelect();
        long countNotSelectedProblems = menu.sizeNotSelectedProblems();
        boolean doMoreProblems = menu.doMoreProblems();
        while (countNotSelectedProblems!=0 && doMoreProblems) {
            System.out.println();
            System.out.println();
            menu.problemsDisplay();
            System.out.println("Enter the question number");
            menu.questionSelect();
            countNotSelectedProblems = menu.sizeNotSelectedProblems();
            if(countNotSelectedProblems==0) {
                System.out.println("=================================================");
                System.out.println("=================================================");
                System.out.println("You don't have any more questions!!! 😊😊😊");
                System.out.println("Thank You !!!");
                break;
            }
            doMoreProblems = menu.doMoreProblems();
        }
    }
}