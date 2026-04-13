package onthigk.singleton.sanpham;

import creational.singleton.a6.SanPham;

public class UI {
  public UI(){}
  public void them(String maSanPham, String tenSanPham, int soluong, double donGia){
    GioHangDuy gh = GioHangDuy.getInstance();
    gh.them(new SanPhamDuy(maSanPham,tenSanPham,soluong,donGia));
  }
}
