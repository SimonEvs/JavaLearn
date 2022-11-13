package Java_Tasks.Fourth;

import java.util.LinkedList;
import java.util.Queue;

public class StorageAndProcessing1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();       //poll -возвращает с удалением элемент
        System.out.println(queue); // [2809]
    //Первый приходит первый уходит, последний приходит -последний уходит.

        // queue.remove(2809);      // зачем очередь??
        // queue.element();           //возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, 
        //                            //инициируется исключение NoSuchElementException.
        // queue.peek();              //возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется.

    }
}
