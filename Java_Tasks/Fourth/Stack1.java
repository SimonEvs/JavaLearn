package Java_Tasks.Fourth;

import java.util.*;

public class Stack1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
        //Метод pop() в Java используется для удаления объекта в верхней части 
        //этого стека и возвращает этот объект в качестве значения этой функции.
    }
}
