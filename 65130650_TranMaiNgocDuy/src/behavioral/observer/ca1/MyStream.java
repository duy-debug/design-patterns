package behavioral.observer.ca1;

import java.util.ArrayList;

public class MyStream<T> {
  ArrayList<IListener<T>> listeners = new ArrayList<>();
  public MyStream() {
    this.listeners = listeners;
  }
  public void addListener(IListener l){
    listeners.add(l);
  }
  public void addEvent(T t){
    for(var listener : listeners){
      listener.listen(t);
    }
  }
}
