package Java_Tasks.Fifth;
import java.util.*;
//«Устаревший брат»  коллекции HashMap, который не знает про null
public class HashTable1 {
    


   public static void main(String[] args) {
       Map<Integer,String> table = new Hashtable<>();
       table.put(1, "два");
       table.put(11, "один один");
       table.put(2, "один");
       System.out.println(table); // {2=один, 1=два, 11=один один}
       // table.put(null, "один"); //  java.lang.NullPointerException
   }
}

