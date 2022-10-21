// Возвести в степень число из одного файла, ответ записать в другой.

import java.io.*;
import java.util.ArrayList;

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
        while ((c = fr.read()) != -1) {
            int[] arr = new int[3];
            for (int i = 0; (c = fr.read()) != -1; i++) {
                if (c == ' ') {
                    continue;
                }
                arr[i] = c;
            int value = arr[0];
            int powValue = arr[1];

        System.out.printf("%d , %d \n", value,powValue);
        System.out.print(powValue);
        int result = (int) Math.pow(value, powValue);
        System.out.println(result);
    }
//         try (FileWriter fw = new FileWriter("output.txt", false)) {
//             // fw.write(result);
        
//             fw.flush();
//         }
//     }

}
        }}