public class CreateWorker {

  // #region
  // private static CreateWorker instance;

  // public static CreateWorker getInstance() {
  // if (instance == null)
  // instance = new CreateWorker();
  // instance.init();
  // return instance;
  // }

  // private CreateWorker() {
  // }

  // private void init() {
  // temp = new Worker();
  // temp.address = "--";
  // temp.jobTitle = "--";
  // temp.age = -1;
  // temp.salary = -2;
  // temp.fullName = "нет данных";
  // }
  // #endregion

  Worker temp;

  public CreateWorker() {
    temp = new Worker();
    temp.address = "--";
    temp.jobTitle = "--";
    temp.age = -1;
    temp.salary = -2;
    temp.fullName = "нет данных";
  }

  // #region
  public CreateWorker setAge(int age) {
    temp.age = age;
    return this;
  }

  public CreateWorker setSalary(int salary) {
    temp.salary = salary;
    return this;
  }

  public CreateWorker setFullName(String fullName) {
    temp.fullName = fullName;
    return this;
  }

  public CreateWorker setAddress(String address) {
    temp.address = address;
    return this;
  }

  public CreateWorker setAddress1(String address1) {
    temp.jobTitle = address1;
    return this;
  }

  // #endregion

  public Worker Create() {
    return temp;
  }
}
