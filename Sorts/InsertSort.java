//Сортировки вставками
package Sorts;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = { 7, 10, 2, 10, 3, 1, 2, 5 };
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            // Вытаскиваем значение элемента
            int value = array[j];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = j - 1;
            while (i >= 0) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
                i--;
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
            System.out.println(Arrays.toString(array));
        }
        // System.out.println(Arrays.toString(array));
    }
}