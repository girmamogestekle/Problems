package problems.com;

public class Problem06 implements Solution {

    @Override
    public void solution() {
        float sum = 0;

        for(float i=0.01f; i<1.0f; i+=0.01f)
            sum += i;

        System.out.println("The sum is " + sum);
    }

    @Override
    public void display() {
        solution();
    }

}
