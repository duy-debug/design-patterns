package onthigk.decorator.cuahanganvat;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<SanPham> sp1 = new ArrayList<>();
    sp1.add(new SanPham("Banh", 25,"Sieu Ngon"));
    sp1.add(new SanPham("Banh trang", 30,"Sieu Gion"));
    AVKC d1 = new DonHang(sp1);
    d1 = new DongGoi(d1);
    d1 = new Topping(d1);
    d1 = new GiamGia(d1);
    d1.hienThi();
  }
}
