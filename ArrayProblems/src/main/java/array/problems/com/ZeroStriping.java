package array.problems.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroStriping {

    public int[][] zeroStrip(int[][] matrix) {
        Set<Integer> uniqueRows = new HashSet<>();
        Set<Integer> uniqueColumns = new HashSet<>();

        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[r].length; c++){
                if(matrix[r][c]==0) {
                    uniqueRows.add(r);
                    uniqueColumns.add(c);
                }
            }
        }
        for(int uniqueRow : uniqueRows)
            Arrays.fill(matrix[uniqueRow], 0);
//        for(int uniqueColumn : uniqueColumns){
//            Arrays.fill(matrix[uniqueColumn], 0);

        return matrix;
    }
}
