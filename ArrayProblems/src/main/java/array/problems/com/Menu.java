package array.problems.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Consumer<String> output = System.out::println;
    private Map<Integer, Boolean> trackQuestions = new HashMap<>();
    private Map<Integer, String> questions = new HashMap<>();
    private Solution solution;

    {
        output.accept("Welcome to Array Problems ");
        output.accept("=================================================");
        output.accept("=================================================");
        addQuestions();
        questionDisplay();
        output.accept("=================================================");
        output.accept("=================================================");
        output.accept("Enter the question number");
    }


    public void addQuestions() {
        String question1 = "Question 1: Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.";
        trackQuestions.put(1, true);
        questions.put(1, question1);
        String question2 = "Question 2: Given 2D array calculate the sum of diagonal elements.";
        trackQuestions.put(2, true);
        questions.put(2, question2);
        String question3 = "Question 3: Given an array, write a function to get first, second best scores from the array and return it in new array.";
        trackQuestions.put(3, true);
        questions.put(3, question3);
        String question4 = "Question 4: Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from \" +\n" +
                "                \"a range of 1 to n, with one missing number, and returns the missing number.";
        trackQuestions.put(4, true);
        questions.put(4, question4);
        String question5 = "Question 5: Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)";
        trackQuestions.put(5, true);
        questions.put(5, question5);
    }

    public void questionDisplay(){
        trackQuestions.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .filter(Map.Entry::getValue)
                .map(e -> questions.get(e.getKey()))
                .forEach(output);
    }

    public void doneQuestion(int questionId) {
        trackQuestions.computeIfPresent(questionId, (k, v) -> !v);
    }

    public void questionSelect(){
        int questionId = scanner.nextInt();
        switch (questionId) {
            case 1:
                solution = new Question01();
                solution.display();
                doneQuestion(1);
                break;
            case 2:
                solution = new Question02();
                solution.display();
                doneQuestion(2);
                break;
            case 3:
                solution = new Question03();
                solution.display();
                doneQuestion(3);
                break;
            case 4:
                solution = new Question04();
                solution.display();
                doneQuestion(4);
                break;
            case 5:
                solution = new Question05();
                solution.display();
                doneQuestion(5);
                break;

            default:
                output.accept("Invalid question number");
        }
    }

    public long sizeNotSelectedQuestions() {
        return trackQuestions.entrySet().stream().filter(Map.Entry::getValue).count();
    }

    public boolean doMoreQuestions() {
        output.accept("");
        output.accept("");
        output.accept("Enter \\'y\\' for do more questions or \\'n\\' for exit");
        output.accept("");
        output.accept("");
        return scanner.next().equals("y");
    }

}
