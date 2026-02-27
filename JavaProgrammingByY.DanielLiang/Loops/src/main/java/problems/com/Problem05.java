package problems.com;

public class Problem05 implements Solution {

    @Override
    public void solution() {
        System.out.print("  ");
        for (int i=1; i<=9; i++)
            System.out.printf("%4d", i);
        System.out.println("\n---------------------------------------");
        for(int j=1; j<=9; j++){
            System.out.print(j + "|");
            for(int k=1; k<=9; k++){
                System.out.printf("%4d",k*j);
            }
            System.out.println();
        }
    }

    @Override
    public void display() {
        System.out.println("Multiplication Table From 1 To 9");
        solution();
    }

}
