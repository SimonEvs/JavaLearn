package Java_Tasks.Third.lib;

public class MyStorage {

    private static int position = 0;
    private static int[] storage = new int[11];

    public static void clear() {
        position = 0;
        int size = storage.length;
        for (int i = 0; i < size; i++) {
            storage[i] = 0;
        }
    }

    public static void print() {
        for (int i = 0; i < storage.length; i++) {
            System.out.printf(storage[i] + " ");
        }
        System.out.println();
    }

    public static void shift() {
        for (int i = 0; i <= position; i++) {
            storage[i] = storage[i + 1];
        }
        storage[position] = 0;
        position--;
    }

    public static void add(int item) {
        if (position >= storage.length)
            return;
        storage[position++] = item;
    }

    public static int remove() {
        int el = storage[0];
        shift();
        return el;
    }
}
