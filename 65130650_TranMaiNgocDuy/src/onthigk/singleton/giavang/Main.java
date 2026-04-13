package onthigk.singleton.giavang;

public class Main {
  public static void main(String[] args) {
    BienDongGiaVangDuy bd = BienDongGiaVangDuy.getInstance();
    UIDuy u1 = new UIDuy();
    UIDuy u2 = new UIDuy();
    UIDuy u3 = new UIDuy();
    u1.them("1", "Vip", 10,11);
    u2.them("3", "Vip", 11,66);
    u3.them("3", "Vip", 11,66);
    bd.in();
    u1.xem("1");
  }
}
