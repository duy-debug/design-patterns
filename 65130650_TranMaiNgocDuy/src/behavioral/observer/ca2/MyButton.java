package behavioral.observer.ca2;

public class MyButton {
  ButtonListener activity;
  public MyButton() {
    this.activity = activity;
  }

  public void attach(ButtonListener listener) {
    this.activity = listener;

  }
  public void click(){
    if(activity != null){
      activity.onClick();
    }
  }
}
