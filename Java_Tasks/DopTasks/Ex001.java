// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.io.*;
import java.lang.StringBuilder;
import java.util.*;

import javax.lang.model.element.VariableElement;

public class Ex001 {
    // public static void Writer(String[] args) {
    // try (FileWriter fw = new FileWriter("output.txt", false)) {
    // fw.write("9");
    // fw.append('\n');
    // fw.append('2');
    // fw.append('\n');
    // fw.flush();
    // } catch (IOException ex) {
    // System.out.println(ex.getMessage());
    // }

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("input.txt");
        int c;
        String str = new String();
        StringBuilder sb = new StringBuilder(str);
        while ((c = fr.read()) != -1) {

            char ch = (char) c;
            sb.append(ch);
            // if (ch == '\n') {
            //     //  System.out.print();
            //     sb.append(' ');
            //     // System.out.print(sb);
                
            // } 
            // else {
            //     //  System.out.println();
            //     sb.append(ch);
            //     //  System.out.print(sb);
            // }

            System.out.print(ch);
            if c=a
            // newArray[i]=c;
            // i++;
            // newArray;

            // int[] arr = new int[3];

            // arr[i] = c;
            // int value = arr[0];
            // int powValue = arr[1];

            // System.out.printf("%d , %d \n", value,powValue);
            // System.out.print(powValue);
            // int result = (int) Math.pow(value, powValue);
            // System.out.println(result);
        }
        // System.out.println(Arrays.toString(newArray));
        // try (FileWriter fw = new FileWriter("output.txt", false)) {
        // // fw.write(result);

        // fw.flush();
        // }
        // }

    }
}