package Java_Tasks.Third;

import java.util.ArrayList;
import java.util.Arrays;

public class WaveAlgoritm {
    public static void main(String[] args) {

        int[][] MyNewArray = {
                { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 },
                { 100, 0, 0, 0, 0, 0, 0, 0, 3, 100 },
                { 100, 0, 0, 0, 1, 0, 0, 0, 0, 100 },
                { 100, 0, 0, 1, 0, 1, 1, 1, 0, 100 },
                { 100, 0, 1, 1, 0, 0, 1, 1, 0, 100 },
                { 100, 2, 0, 1, 0, 1, 1, 1, 0, 100 },
                { 100, 0, 0, 1, 0, 1, 1, 1, 0, 100 },
                { 100, 1, 0, 0, 0, 1, 1, 0, 0, 100 },
                { 100, 1, 0, 0, 0, 0, 0, 0, 1, 100 },
                { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 } };
        int[] ResultArrayi = new int[10];
        int[] ResultArrayj = new int[10];
        for (int i = 0; i < MyNewArray.length; i++) {
            for (int j = 0; j < MyNewArray[i].length; j++) {
                if (MyNewArray[i][j] == 1)
                    System.out.printf("▒▒");
                else if (MyNewArray[i][j] == 100) {

                    System.out.printf("++");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }

        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> column = new ArrayList<Integer>();
        int i = 5;
        int j = 1;
        int num = 1;
        while (i < 100) {
            
            
            num++;
            if (MyNewArray[i - 1][j] == 0) {
                column.add(j);
                row.add(i - 1);
                MyNewArray[i - 1][j] = num;
            }

            if (MyNewArray[i][j + 1] == 0) {
                column.add(j + 1);
                row.add(i);
                MyNewArray[i][j + 1] = num;
            }
            if (MyNewArray[i + 1][j] == 0) {
                column.add(j);
                row.add(i + 1);
                MyNewArray[i + 1][j] = num;
            }
            if (MyNewArray[i][j - 1] == 0) {
                column.add(j - 1);
                row.add(i);
                MyNewArray[i][j - 1] = num;
            } 
            else {
                break;
            }
            
            System.out.println(row);
            i=row[0];
            j=column[0];

        }
        System.out.print(row);
        System.out.print(column);
        // System.out.println(Arrays.deepToString(MyNewArray));
        // for (int k = 0; k < MyNewArray.length; k++) {
        //     for (int l = 0; l < MyNewArray[k].length; l++) {
        //         System.out.print(MyNewArray[i][l] + ' ');
        //     }
        // }
        
    }
}
