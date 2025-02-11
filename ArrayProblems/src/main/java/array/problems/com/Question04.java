package array.problems.com;

import java.util.Arrays;

public class Question04 implements Solution {

    private int missingNumber;

    @Override
    public void solution() {
        System.out.println("Question 4: Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from " +
                "a range of 1 to n, with one missing number, and returns the missing number.");
        int[] inputs = {1,2,3,4,6};
        System.out.println("The inputs are: " + Arrays.toString(inputs));
        int startElement = 1, endElement=inputs[inputs.length-1];
        int startIndex=0, endIndex=inputs.length-1;
        while (startElement < endElement) {
            if(startElement != inputs[startIndex]) {
                missingNumber = startElement;
                break;
            } else if(endElement != inputs[endIndex]) {
                missingNumber = endElement;
                break;
            } else{
                startElement++;
                startIndex++;
                endElement--;
                endIndex--;
            }
        }
    }

    @Override
    public void display() {
        solution();
        System.out.println("The missing number in the array is  " + missingNumber);
    }
}
