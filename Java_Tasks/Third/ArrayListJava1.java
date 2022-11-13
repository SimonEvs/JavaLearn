package Java_Tasks.Third;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListJava1 {
    public static void main(String[] args) {
    ArrayList<Integer> List1= new ArrayList<Integer>();
    List1.add(1);
    List1.add(456);
    List1.add(89);
    List1.add(1);
    List1.add(89);
    // for (Object o : List1) {
    //     System.out.println(o);
        
    // }
    System.out.println(List1.get(0));
    System.out.println(List1);
    System.out.println(List1.indexOf(89));
    System.out.println(List1.lastIndexOf(89));
    System.out.println(List1.set(0,89));
    System.out.println(List1);
    System.out.println(List1.subList(1,4));
    Collections.sort(List1);
    System.out.println(List1);
}
}