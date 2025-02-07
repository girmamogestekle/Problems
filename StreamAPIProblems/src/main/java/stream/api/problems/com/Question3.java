package stream.api.problems.com;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 implements Solution{

    private List<Integer> evenNumbers;

    @Override
    public void solution() {
        System.out.println("Question 3: Filter even numbers?");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        evenNumbers = numbers.stream()
                .filter(num -> num%2 == 0)
                .collect(Collectors.toList());
    }

    @Override
    public void display() {
        solution();
        evenNumbers.forEach(System.out::println);
    }
}
