import java.io.Writer;
import java.util.ArrayList;

class Goods {

  public int count;
  public String name;
  public double price;
  public StringBuilder description;

  
  class ProxyName {
    String val;

    public ProxyName(String v) {
      this.val = v != null ? v : "EMPTY";

      if (v != null)
        this.val = v;
      else
        this.val = "EMPTY";
    }

    public String getVal() {
      return val;
    }
  }

  public Goods(String name) {
    this.name = new ProxyName(name).getVal();
  }

  public Goods(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public Goods(int count, String name) {
    this.count = count;
    this.name = name;
  }

  public Goods(int count, String name, double price) {
    this.count = count;
    this.name = name;
    this.price = price;
  }
}

public class app {
  public static void main(String[] args) {

    String s = new StringBuilder()
        .append("cssd")
        .append("cssd")
        .append("cssd")
        .append("cssd")
        .append("cssd")
        .append("cssd")
        .toString();

    // Goods car = new Goods("Товар");
    // car.count = 123;
    // car.description = new StringBuilder("cscsd");
    // car.description.append("");
    // car.price = 1231;
    // Worker w = CreateWorker
    // .getInstance()
    // .Create();

    // w.print();

    // w = CreateWorker
    // .getInstance()
    // .setAddress("мск ленина 122")
    // // .setAge(44)
    // .setFullName("Имя фамилия")
    // .setAddress1("new что-то там")
    // // .setSalary(4567)
    // .Create();

    // w.print();

  }
}
