package array.problems.com;

import java.util.Arrays;

public class Question05 implements Solution{

    int[] removeDuplicates;

    @Override
    public void solution() {
        System.out.println("Question 5: Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)");
        int[] inputs = {1,1,2,2,3,4,5};
        System.out.println("The inputs are: " + Arrays.toString(inputs));
        int[] copyInputs = new int[inputs.length];
        System.arraycopy(inputs, 0, copyInputs, 0, inputs.length);
        int index1 = 0, index2 = 1;
        int value1 = inputs[index1], value2 = inputs[index2];
        int size = 1;
        while(index1<index2 && index2<inputs.length){
            if(value1 == value2){
                index2++;
                value2 = inputs[index2];
            } else{
                index1++;
                copyInputs[index1] = value2;
                value1 = value2;
                index2++;
                size++;
            }
        }
        removeDuplicates = new int[size];
        System.arraycopy(copyInputs, 0, removeDuplicates, 0, size);
    }

    @Override
    public void display() {
        solution();
        System.out.println("The unique elements are  " + Arrays.toString(removeDuplicates));
    }
}
