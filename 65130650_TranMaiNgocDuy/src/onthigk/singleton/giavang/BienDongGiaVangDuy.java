package onthigk.singleton.giavang;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BienDongGiaVangDuy {
  private static BienDongGiaVangDuy instance;
  ArrayList<VangDuy> ds = new ArrayList<>();
  private BienDongGiaVangDuy(){}
  public static BienDongGiaVangDuy getInstance(){
    if(instance == null){
      instance = new BienDongGiaVangDuy();
    }
    return instance;
  }
  public void them(VangDuy d){
    ds.add(d);
  }
  public void xem(String ngay){
    for(var d: ds){
      if(ngay.equals(d.getNgay())){
        System.out.println(d.toString());
      }
    }
  }
  public void in(){
    for(var d: ds){
      System.out.println(d.toString());
    }
  }
}
