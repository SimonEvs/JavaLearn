
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



public class ways {

    static int solve(int s, int e, int p, int m) {
      int[] ways = new int[e + p];
      ways[s] = 1;
  
      for (int i = s + p; i <= e; i++) {
        ways[i] = i % m == 0 ? ways[i - p] + ways[i / m] : ways[i - p];
      }
  
      for (int i = 0; i < ways.length; i++) {
        System.out.printf(ways[i] + "  ");
      }
      return ways[e];
    }
  
    static int f(int s, int e, int p, int m) {
  
      // return e == s ? 1
      // : e % m == 0 ? f(s, e - p, p, m) + f(s, e / m, p, m)
      // : f(s, e - p, p, m);
      if (e == s)
        return 1;
      else if (e % m == 0)
        return f(s, e - p, p, m) + f(s, e / m, p, m);
      else
        return f(s, e - p, p, m);
    }
  
    public static void main(String[] args) {
  
      int a = 1;
      int b = 2;
      int max;
  
      if (a > b)
        max = a;
      else
        max = b;
  
      max = a > b ? a : b;
  
      // solve(2, 110, 1, 2);
      // System.out.println(f(2, 110, 1, 2));
  
      f1(2, 11, 1, 2);
    }
  
    // f(s,e)=> {
    // |if(i%2==0)=>return ways[i-1]+ways[i/2]
    // | if(i % 2 != 0) => return ways[i-1]
  
    static int f1(int s, int e, int p, int m) {
      int[] ways = new int[e + 1];
      ways[s] = 1;
  
      for (int i = s + 1; i <= e; i++) {
  
        ways[i] = i % m == 0
            ? ways[i - p] + ways[i / m]
            : ways[i - p];
      }
      // for (int i = s + 1; i <= e; i++) {
      // if (i % m == 0)
      // ways[i] = ways[i - p] + ways[i / m];
      // else
      // ways[i] = ways[i - p];
      for (int i = 0; i < ways.length; i++) {
        System.out.printf(ways[i] + "  ");
      }
      System.out.println();
      return ways[e];
    }
  
  }







// import java.util.Scanner;
// import java.util.ArrayList;

// public class ways {
//     static void FindWay(int variant, double first, double second, double third, double fourth) {
//         ArrayList<String> res = new ArrayList<String>();
//         if (first == 0) {
//             System.out.println("Нельзя");
//             System.exit(0);
//         }
//         if (variant == 1) {
//             while (first != second) {
//                 first *= third;
//                 res.add("k1");

//                 if (first > second) {
//                     res.remove(res.size() - 1);
//                     first /= third;
//                     first += fourth;
//                     res.add("k2");
//                 }
//             }

//             System.out.println(res);
//         }

//         if (variant == 2) {
//             res = new ArrayList<String>();
//             while (first != second) {
//                 first += fourth;
//                 res.add("k2");
//             }
//             System.out.println(res);
//         }

//         if (variant == 3) {
//             res = new ArrayList<String>();
//             while (first != second) {
//                 int temp = (int) (Math.random() * 2);
//                 if ((temp == 0) & (first != second) & (first < second)) {
//                     first *= third;
//                     res.add("k1");
//                     if (first*third>second){
//                         first/=third;
//                         res.remove(res.size() - 1);
//                         first+=fourth;
//                         res.add("k2");
//                     }
//                     System.out.println(res);
//                 }
//                 if ((temp == 1) & (first != second) & (first < second)) {
//                     first += fourth;
//                     res.add("k2");
//                     System.out.println(res);
//                 }

//                 if(first>second |first==second) {
//                     System.exit(0);
//                 }
//             }
//             // System.out.println(res);

//         }
//     }

//     public static void main(String[] args) {
//         FindWay(1, 2, 14, 2, 1);

//     }
// }
