package Java_Tasks.Third;

import java.util.ArrayList;
import java.util.Arrays;

public class WaveAlgoritm {
    public static void main(String[] args) {
// Задали массив со стенами
//ограждения 100
//стены 1
//Выход 99
//Начало в 98
        int[][] MyNewArray = {
                { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 },
                { 100, 0, 0, 0, 0, 0, 0, 0, 99, 100 },
                { 100, 0, 0, 0, 1, 0, 0, 0, 0, 100 },
                { 100, 0, 0, 1, 0, 1, 1, 1, 0, 100 },
                { 100, 0, 1, 1, 0, 0, 1, 1, 0, 100 },
                { 100, 98, 0, 1, 0, 1, 1, 1, 0, 100 },
                { 100, 0, 0, 1, 0, 1, 1, 1, 0, 100 },
                { 100, 1, 0, 0, 0, 1, 1, 0, 0, 100 },
                { 100, 1, 0, 0, 0, 0, 0, 0, 1, 100 },
                { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 } };
       
        for (int i = 0; i < MyNewArray.length; i++) {
            for (int j = 0; j < MyNewArray[i].length; j++) {
                if (MyNewArray[i][j] == 1)
                    System.out.printf("▒▒");
                else if (MyNewArray[i][j] == 100) {

                    System.out.printf("++");
                } 
                else if (MyNewArray[i][j] == 98)
                System.out.printf("**");
                else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
        // Задали два листа в которые будем записывать индексы i и j
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> column = new ArrayList<Integer>();
        int i = 5;
        int j = 1;
        // num- число, которое должно храниться в клетке, изначально у нас оно равно 1
        int num = 1;
        while (num== 7) {
            
            //Добавляем к num единицу, так как следующая точка будет на единицу больше предыдущей
            num++;

            //Если клетка равна нулю, то добавляем индексы в специальные листы(индексы для i и для j)
            //Далее присваиваем клетке значение num, которое на единицу больше предыдущего
            //А если значение равно 100, то, считаем, что уперлись в границу, пропускаем действие
            if (MyNewArray[i - 1][j] == 0) { 
                if (MyNewArray[i - 1][j] == 100){
                    continue;
                }
                column.add(j);
                row.add(i - 1);
                MyNewArray[i - 1][j] = num;
            }

            if (MyNewArray[i][j + 1] == 0) {
                if (MyNewArray[i][j + 1] == 0){
                    continue;
                }
                column.add(j + 1);
                row.add(i);
                MyNewArray[i][j + 1] = num;
            }
            if (MyNewArray[i + 1][j] == 0) {
                if (MyNewArray[i + 1][j] == 0){
                    continue;
                }
                column.add(j);
                row.add(i + 1);
                MyNewArray[i + 1][j] = num;
            }
            if (MyNewArray[i][j - 1] == 0) {
                if (MyNewArray[i][j - 1] == 0){
                    continue;
                }
                column.add(j - 1);
                row.add(i);
                MyNewArray[i][j - 1] = num;
            } 
            else {
                break;
            }
            
            //Здесь берем значение индексов и меняем, то есть делаем изначальной точкой другую, 
            //но уже у нее будет номер на единицу больше предыдущей
            i=row.get(0);
            j=column.get(0);
            row.remove(0);
            column.remove(0);

        }
        // System.out.print(row);
        // System.out.print(column);

        System.out.println(Arrays.deepToString(MyNewArray));

        // for (int k = 0; k < MyNewArray.length; k++) {
        //     for (int l = 0; l < MyNewArray[k].length; l++) {
        //         System.out.print(MyNewArray[i][l] + ' ');
        //     }
        // }
        
    }
}
