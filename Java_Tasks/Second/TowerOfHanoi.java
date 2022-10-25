//Написать программу, показывающую последовательность действий для игры “Ханойская башня”

package Java_Tasks.Second;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int count = 3;
        moveRing('A', 'B', 'C', count);
    }

    public static void moveRing(char a, char b, char c, int count) {

        if (count == 1) {
            System.out.println(String.format("from %s to %s | Из %s в %s", a, b, a, b));
        } else {
            moveRing(a, c, b, count - 1);
            System.out.println(String.format("from %s to %s | Из %s в %s", a, b, a, b));
            moveRing(c, b, a, count - 1);
        }

    }
}
