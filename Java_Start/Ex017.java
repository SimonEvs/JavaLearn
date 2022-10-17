package Java_Start;
import java.util.Scanner;
public class Ex017 {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("int a: ");
       boolean flag = iScanner.hasNextInt();
       System.out.println(flag);       
       int i = iScanner.nextInt();
       System.out.println(i);       
       iScanner.close();
   } }
