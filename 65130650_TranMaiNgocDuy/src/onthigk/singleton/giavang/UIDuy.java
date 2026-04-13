package onthigk.singleton.giavang;

public class UIDuy {
  public UIDuy() {}
  public void them(String ngay, String loaiVang, double giaMua, double giaBan) {
    BienDongGiaVangDuy bd = BienDongGiaVangDuy.getInstance();
    bd.them(new VangDuy(ngay, loaiVang, giaMua, giaBan));
  }
  public void xem(String ngay){
    BienDongGiaVangDuy bd = BienDongGiaVangDuy.getInstance();
    bd.xem(ngay);
  }
}
