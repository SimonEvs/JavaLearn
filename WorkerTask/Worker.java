public class Worker {

  int age;
  int salary;
  String fullName;
  String address;
  String jobTitle;
  // 1+3+3+1 = 8 => 2^n

  public void print() {
    System.out.println(
        String.format(
            "%d %d %s %s %s",
            age,
            salary,
            fullName,
            address,
            jobTitle));
  }
}
