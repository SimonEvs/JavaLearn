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
        char ch;
        String str = new String();
        StringBuilder sb = new StringBuilder(str);
        while ((c = fr.read()) != -1) {

            ch = (char) c;
            sb.append(ch);
        }
        str = String.valueOf(sb);
        System.out.println(str);
        char[] newString=str.toCharArray();
        String[] words = str.split((" "));
        String[] temp = words[1].split(",");
        int secondNumber = Integer.parseInt(words[3]);
        int firstNumber = Integer.parseInt(temp[0]);
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        
        // int powValue;
        // int value;
        int powValue=firstNumber;
        int value=secondNumber;
        System.out.println("ответ - "+ value+" в степени "+powValue+"="+ Math.pow((int)value,(int) powValue));

        //System.out.println("привет"+newString);

        // if (newString[0] == "b") {
        //     powValue = firstNumber;
        //     value = secondNumber;
        //     System.out.print("Степень равна -" + powValue);
        //     System.out.print("Основное число равно-" + value);
        // }
        // if (newString[0] == "a") {
        //     powValue = secondNumber;
        //     value = firstNumber;
        // System.out.println("Степень равна -" + powValue);
        // System.out.println("Основное число равно-" + value);
        // }

        // String[] firstLine=(words);

        // System.out.print(sb);
        // System.out.println(Arrays.toString(newArray));
        // try (FileWriter fw = new FileWriter("output.txt", false)) {
        // // fw.write(result);

        // fw.flush();
        // }
        // }

    }
}