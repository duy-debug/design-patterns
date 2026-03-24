package behavioral.observer.ca2;

public class Main {
  public static void main(String[] args) {
    MyButton myButton = new MyButton();
    Activity a = new Activity(myButton);
    a.onClick();
    a.onClick();
    a.onClick();
    a.onClick();
  }
}
