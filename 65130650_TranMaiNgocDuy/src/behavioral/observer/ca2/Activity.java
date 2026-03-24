package behavioral.observer.ca2;

public class Activity implements ButtonListener {
  MyButton button;
  int count = 0;

  public Activity(MyButton myButton) {
    this.button = myButton;
    this.button.attach(this);
  }
  public Activity() {

  }
  @Override
  public void onClick() {
    count++;
    System.out.println(count);
  }
}
