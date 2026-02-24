package problems.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem04 implements Solution{

    String filePathNumbers = "/Users/girmamogesteklemariam/ComputerEngineering/Lab/Problems/JavaProgrammingByY.DanielLiang/Loops/src/main/java/problems/com/Problem04Numbers.txt";
    String filePathAnswers = "/Users/girmamogesteklemariam/ComputerEngineering/Lab/Problems/JavaProgrammingByY.DanielLiang/Loops/src/main/java/problems/com/Problem04Answers.txt";
    int sum = 0;

    @Override
    public void solution() {

        try(BufferedReader br = new BufferedReader(new FileReader(filePathNumbers))){
            String line;
            while ((line = br.readLine()) != null) {
                if(line.contains("  ")){
                    System.out.println("Double space found. Terminating the loop");
                    break;
                }
                String[] words = line.split(" ");
                for(String word : words){
                    sum += Integer.parseInt(word);
                }
            }

            FileWriter writer = new FileWriter(filePathAnswers);
            writer.write(String.valueOf(sum));
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void display() {
        solution();
    }
}
