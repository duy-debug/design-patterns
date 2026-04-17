package onthigk.decorator.goicuoc;

public class MainDuy {
  public static void main(String[] args) {
    DangKyGoiCuoc d = new GoiCuocDuy("5G",50);
    d = new ChuyenVungDuy(d);
    d = new NhacChoDuy(d);
    d = new GoiMangDuy(d);
    d = new DangKy4GDuy(d);
    System.out.println(d.getDescription());
    System.out.println("Tổng chi phí: "+d.tinhTong());
  }
}
