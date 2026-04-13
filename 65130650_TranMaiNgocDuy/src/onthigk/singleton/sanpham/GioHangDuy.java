package onthigk.singleton.sanpham;

import java.util.ArrayList;

public class GioHangDuy {
  private static GioHangDuy instance;
  public ArrayList<SanPhamDuy> sp = new ArrayList();
  private GioHangDuy(){}
  public static GioHangDuy getInstance(){
    if(instance == null){
      instance = new GioHangDuy();
    }
    return instance;
  }
  public void them(SanPhamDuy s){
    System.out.println("Thêm sản phẩm thành công!");
    sp.add(s);
  }
  public void in(){
    for(var s: sp){
      System.out.println(s.toString());
    }
  }
}
