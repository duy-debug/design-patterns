package creational.singleton;

public class MySingleton {
  private static MySingleton instance; // fields
  int count = 0;
  private MySingleton() { // constructor
  }
  public static MySingleton getInstance() {
    // Uses "Lazy initialization"
    if (instance == null) {
      instance = new MySingleton();
    }
    return instance;
  }
  public void myPrint(){
    System.out.println(++count);
  }

}
