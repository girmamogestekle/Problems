package leet.code.problems.com;

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
        output.accept("Welcome to Leetcode Problems ");
        output.accept("=================================================");
        output.accept("=================================================");
        addQuestions();
        questionDisplay();
        output.accept("=================================================");
        output.accept("=================================================");
        output.accept("Enter the question number");
    }


    public void addQuestions() {
        String question136 = "Question 136: Single Number?";
        trackQuestions.put(136, true);
        questions.put(136, question136);
        String question169 = "Question 169: Majority Element?";
        trackQuestions.put(169, true);
        questions.put(169, question169);
        String question217 = "Question 217: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.";
        trackQuestions.put(217, true);
        questions.put(217, question217);
        String question3432 = "Question 3432: Count partitions with even sum difference?";
        trackQuestions.put(3432, true);
        questions.put(3432, question3432);
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
            case 136:
                solution = new Question136();
                solution.display();
                doneQuestion(136);
                break;
            case 169:
                solution = new Question169();
                solution.display();
                doneQuestion(169);
                break;
            case 217:
                solution = new Question217();
                solution.display();
                doneQuestion(217);
                break;
            case 3432:
                solution = new Question3432();
                solution.display();
                doneQuestion(3432);
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
