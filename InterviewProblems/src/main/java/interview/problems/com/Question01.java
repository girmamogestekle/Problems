package interview.problems.com;

import java.util.*;

public class Question01 implements Solution {

    private List<Integer> reverseList = new ArrayList<>();
    private Node node;

    @Override
    public void solution() {
        System.out.println("Question 1: You are given two non-empty linked lists representing two non-negative integers. " +
                "The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list." +
                "Example: Input 1: [2,4,3] and Input 2: [5,4,6] .... Output: [7,0,8]. Explanation: 342 + 465 = 807");
        int[] input1 = {2,4,3};
        int[] input2 = {5,6,4};
        System.out.println("The inputs are: Input 1: " + Arrays.toString(input1) + ", Input 2: " + Arrays.toString(input2));
        int sum = input1[input1.length-1] + input2[input2.length-1];
        int digits = countIntegerDigits(sum);
        int powTen = (int)(Math.pow(10, digits));
        int remind = sum/powTen;
        int nodeData = sum>9? sum%powTen:sum;
        node = new Node(nodeData);
        node.display();
        for(int i=input1.length-2; i>=0; i--) {
            sum = (input1[i] + input2[i]) + remind;
            digits = countIntegerDigits(sum);
            powTen = (int)(Math.pow(10, digits-1));
            remind = sum/powTen;
            nodeData = sum>9? sum%powTen:sum;
            node.next = new Node(nodeData);
            node.next.display();
        }

        if(remind > 0) node.next = new Node(nodeData);

        Node temp = node;

        while(temp != null) {
            reverseList.add(temp.data);
            temp = temp.next;
        }

    }

    @Override
    public void display() {
        solution();
        System.out.println("The reverse list is " + reverseList.toString());
    }

    private int countIntegerDigits(int num){
        if(num == 0) return 1;
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }

}
