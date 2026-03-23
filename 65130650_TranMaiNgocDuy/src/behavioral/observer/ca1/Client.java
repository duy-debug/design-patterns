package behavioral.observer.ca1;

import java.util.ArrayList;

public class Client implements IListener<ArrayList<MonHoc>>{
  MyStream<ArrayList<MonHoc>> stream;
  public Client(MyStream<ArrayList<MonHoc>> stream){
    this.stream = stream;
    stream.addListener(this);
  }
  @Override
  public void listen(ArrayList<MonHoc> monHocs) {
    for(var monHoc : monHocs){
      System.out.println(monHoc.toString());
    }
  }
}
