package problems.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Consumer<String> output = System.out::println;
    private Map<Integer, Boolean> trackProblems = new HashMap<>();
    private Map<Integer, String> problems = new HashMap<>();
    private Solution solution;

    {
        output.accept("Welcome to Java Programming By Y.Daniel Liang Loop Problems ");
        output.accept("=================================================");
        output.accept("=================================================");
        addProblems();
        problemsDisplay();
        output.accept("=================================================");
        output.accept("=================================================");
        output.accept("Enter the problem number");
    }


    public void addProblems() {
        String problem01 = "Problem 1: Guessing Numbers";
        trackProblems.put(1, true);
        problems.put(1, problem01);

        String problem02 = "Problem 2: Subtraction Quiz Loop";
        trackProblems.put(2, true);
        problems.put(2, problem02);

        String problem03 = "Problem 3: Sentinel Value";
        trackProblems.put(3, true);
        problems.put(3, problem03);

        String problem04 = "Problem 4: Input and Output Redirections";
        trackProblems.put(4, true);
        problems.put(4, problem04);

        String problem05 = "Problem 5: Multiplication Table";
        trackProblems.put(5, true);
        problems.put(5, problem05);

        String problem06 = "Problem 6: Minimizing Numeric Errors";
        trackProblems.put(6, true);
        problems.put(6, problem06);

        String problem07 = "Problem 7: Finding the Greatest Common Divisor";
        trackProblems.put(7, true);
        problems.put(7, problem07);
    }

    public void problemsDisplay(){
        trackProblems.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .filter(Map.Entry::getValue)
                .map(e -> problems.get(e.getKey()))
                .forEach(output);
    }

    public void doneProblem(int problemId) {
        trackProblems.computeIfPresent(problemId, (k, v) -> !v);
    }

    public void questionSelect(){
        int problemId = scanner.nextInt();
        switch (problemId) {
            case 1:
                solution = new Problem01();
                solution.display();
                doneProblem(1);
                break;
            case 2:
                solution = new Problem02();
                solution.display();
                doneProblem(2);
                break;
            case 3:
                solution = new Problem03();
                solution.display();
                doneProblem(3);
                break;
            case 4:
                solution = new Problem04();
                solution.display();
                doneProblem(4);
                break;
            case 5:
                solution = new Problem05();
                solution.display();
                doneProblem(5);
                break;
            case 6:
                solution = new Problem06();
                solution.display();
                doneProblem(6);
                break;
            case 7:
                solution = new Problem07();
                solution.display();
                doneProblem(7);
                break;

            default:
                output.accept("Invalid question number");
        }
    }

    public long sizeNotSelectedProblems() {
        return trackProblems.entrySet().stream().filter(Map.Entry::getValue).count();
    }

    public boolean doMoreProblems() {
        output.accept("");
        output.accept("");
        output.accept("Enter \\'y\\' for do more problems or \\'n\\' for exit");
        output.accept("");
        output.accept("");
        return scanner.next().equals("y");
    }

}
