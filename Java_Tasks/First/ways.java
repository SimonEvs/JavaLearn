
// b > a, a, b, c, d - натуральные

// На вход некоторому исполнителю подаётся два числа (a, b). 
// У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд

// а = 2, b = 7, c = 2, d = 1
// 2 -> 4 
//        -> 5 
//             -> 6 
//                  -> 7
//   -> 3 -> 6
//             -> 7
//        -> 4
//             -> 5
//                  -> 6
//                       -> 7 
// * Общее количество маршрутов

import java.util.Scanner;
import java.util.ArrayList;

public class ways {
    // static void MyltyMethod(int first, int second){
    // first=first*second;
    // System.out.print(first);
    // }
    // static void SumMethod(int first, int second){
    // int res=first+second;
    // System.out.print(res);
    // }
    static void FindWay(int variant, double first, double second, double third, double fourth) {
        ArrayList<String> res = new ArrayList<String>();
        if (first == 0) {
            System.out.println("Нельзя");
            System.exit(0);
        }
        if (variant == 1) {
            while (first != second) {
                first *= third;
                res.add("k1");

                if (first > second) {
                    res.remove(res.size() - 1);
                    first /= third;
                    first += fourth;
                    res.add("k2");
                }
            }

            System.out.println(res);
        }

        if (variant == 2) {
            res = new ArrayList<String>();
            while (first != second) {
                first += fourth;
                res.add("k2");
            }
            System.out.println(res);
        }

        if (variant == 3) {
            res = new ArrayList<String>();
            while (first != second) {
                int temp = (int) (Math.random() * 2);
                if ((temp == 0) & (first != second) & (first < second)) {
                    first *= third;
                    res.add("k1");
                    if (first*third>second){
                        first/=third;
                        res.remove(res.size() - 1);
                        first+=fourth;
                        res.add("k2");
                    }
                    System.out.println(res);
                }
                if ((temp == 1) & (first != second) & (first < second)) {
                    first += fourth;
                    res.add("k2");
                    System.out.println(res);
                }

                if(first>second |first==second) {
                    System.exit(0);
                }
            }
            // System.out.println(res);

        }
    }
    // public static void main(String[] args) {
    // int res=Null;
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("Введите а: ");
    // int a = iScanner.nextInt();
    // System.out.printf("Введите b: ");
    // int b = iScanner.nextInt();
    // System.out.printf("Введите c: ");
    // int c = iScanner.nextInt();
    // System.out.printf("Введите d: ");
    // int d = iScanner.nextInt();
    // System.out.printf("a=%s, b=%s, c=%s, d=%s", a, b, c, d);
    // iScanner.close();

    // }

    public static void main(String[] args) {
        FindWay(2, 2, 14, 2, 1);

    }
}
