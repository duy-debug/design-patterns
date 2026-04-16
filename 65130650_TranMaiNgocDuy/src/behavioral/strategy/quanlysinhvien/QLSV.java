package behavioral.strategy.quanlysinhvien;

import java.util.ArrayList;
import java.util.Comparator;

public class QLSV {
  ISoSanh soSanh;
  Comparator comparator;
  ArrayList<SinhVien> dsSV = new ArrayList<>();
  public void setSoSanh(ISoSanh<SinhVien> soSanh) {
    this.soSanh = soSanh;
  }
  public void themSV(SinhVien sv) {
    dsSV.add(sv);
  }
  public void sapXep1(){
    dsSV.sort(comparator);
  }
  public void sapXep() {
    for (int i = 0; i < dsSV.size() - 1; i++) {
      for (int j = i + 1; j < dsSV.size(); j++) {
        if (soSanh.soSanh(dsSV.get(i), dsSV.get(j)) == -1) {
          SinhVien temp = dsSV.get(i);
          dsSV.set(i, dsSV.get(j));
          dsSV.set(j, temp);
        }
      }
    }
  }
  public void inDS(){
    for(var i: dsSV){
      System.out.println(i.toString());
    }
  }
}
