package Java_Start;
import java.util.Scanner;
public class Ex026 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int mounth = iScanner.nextInt();
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
	
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
}
