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
