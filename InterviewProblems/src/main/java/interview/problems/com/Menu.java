package interview.problems.com;

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
        output.accept("Welcome to Interview Problems ");
        output.accept("=================================================");
        output.accept("=================================================");
        addQuestions();
        questionDisplay();
        output.accept("=================================================");
        output.accept("=================================================");
        output.accept("Enter the question number");
    }


    public void addQuestions() {
        String question1 = "Question 1: You are given two non-empty linked lists representing two non-negative integers. \" +\n" +
                "                \"The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.\" +\n" +
                "                \"Example: Input 1: [2,4,3] and Input 2: [5,4,6] .... Output: [7,0,8]. Explanation: 342 + 465 = 807\"";
        trackQuestions.put(1, true);
        questions.put(1, question1);
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
