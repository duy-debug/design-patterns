package creational.singleton;
// Singleton = chỉ tồn tại đúng 1 object trong suốt chương trình
public class Main {
  public static void main(String[] args) {
    // static TênLớp.phươngThức()
    // non-static object.phươngThức()
    MySingleton my = MySingleton.getInstance(); // vì Constructor bị private k thể dùng new
    MySingleton my2 = MySingleton.getInstance(); // vì phương thức static thuộc về lớp k thuộc về object
    my.myPrint(); // myPrint() thuộc về object
    my2.myPrint(); // my và my2 là 2 biến tham chieu trỏ đến cùng 1 object
    my.myPrint();
    my2.myPrint();
    my.myPrint();
  }
}
