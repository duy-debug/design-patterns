package behavioral.observer.ca1;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    MyStream<ArrayList<MonHoc>> stream = new MyStream<>();
    Client c = new Client(stream);
    DataAccess access = new DataAccess(stream);
    access.add(new MonHoc("Kiến trúc và thiết kế phần mềm",3));
    access.add(new MonHoc("Lập trình thiết bị di động",4));
    access.add(new MonHoc("Lập trình ",4));
  }
}
