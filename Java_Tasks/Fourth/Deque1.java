import java.util.*;
public class Deque1 {
   public static void main(String[] args) {
       Deque<Integer> deque = new ArrayDeque<>();
       deque.add(3);
       deque.add(28);
       deque.add(238);
       System.out.println(deque);
       deque.addFirst(1);   
       System.out.println(deque);
       deque.addLast(2);
       System.out.println(deque);
       deque.removeLast();  
       System.out.println(deque);
       deque.removeLast();
       System.out.println(deque);
       deque.offerFirst(1); 
       System.out.println(deque);
       deque.offerLast(2);
       System.out.println(deque);
       deque.pollFirst();   
       System.out.println(deque);
       deque.pollLast();
       System.out.println(deque);
       deque.getFirst();    
       System.out.println(deque);
       deque.getLast();
       System.out.println(deque);
       deque.peekFirst();   
       
       deque.peekLast();
       System.out.println(deque);
   }
}
