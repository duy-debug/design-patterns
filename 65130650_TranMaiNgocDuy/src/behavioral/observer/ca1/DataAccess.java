package behavioral.observer.ca1;

import java.util.ArrayList;

public class DataAccess{
  ArrayList<MonHoc> monHocs = new ArrayList<>();
  MyStream<ArrayList<MonHoc>> stream;

  public DataAccess(MyStream<ArrayList<MonHoc>> stream) {
    this.stream = stream;
  }
  public void add(MonHoc m){
    monHocs.add(m);
    stream.addEvent(monHocs);
  }
}
