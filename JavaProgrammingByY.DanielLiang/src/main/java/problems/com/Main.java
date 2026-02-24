package problems.com;

import java.util.Scanner;

public class Main {

    {
        System.out.println("Welcome to Introduction to Java Programming By Y.Daniel Liang");
        System.out.println("=================================================");
        System.out.println("=================================================");
        System.out.println("Choose one of the following chapter's number");
        System.out.println("=================================================");
        System.out.println("=================================================");
        displayChapters();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputChapterNumber = scanner.nextInt();
//        switch (inputChapterNumber) {
//            case 4:
//                IMain loopsMain = new LoopsMain();
//        }
    }

    private void displayChapters(){
        System.out.println("Chapter 4: Loops");
    }
}
