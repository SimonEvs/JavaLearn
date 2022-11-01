package Java_Tasks.Third;

import java.util.ArrayList;

import Java_Tasks.Third.lib.MyStorage;

public class App {

  MyStorage.

  public static void main(String[] args) {

    MyStorage.print();
    MyStorage.add(1);
    MyStorage.print();
    MyStorage.add(2);
    MyStorage.print();
    MyStorage.add(3);
    MyStorage.print();
    System.out.println(MyStorage.remove());
    MyStorage.print();
    System.out.println(MyStorage.remove());
    MyStorage.print();
    System.out.println(MyStorage.remove());

    MyStorage.print();
    MyStorage.add(1);
    MyStorage.print();
    MyStorage.add(2);
    MyStorage.print();
    MyStorage.add(3);
    MyStorage.print();

    System.out.println(MyStorage.remove());
    MyStorage.print();

  }
}

// 0 0 0 0 0 0 0 0 0 0
// void add (int item)
// int remove (void)
// add(2)
// 2 0 0 0 0 0 0 0 0 0
// add(12)
// 2 12 0 0 0 0 0 0 0 0
// add(1)
// 2 12 1 0 0 0 0 0 0 0
// el = remove()
// 12 1 0 0 0 0 0 0 0 0
// el = remove()
// 1 0 0 0 0 0 0 0 0 0