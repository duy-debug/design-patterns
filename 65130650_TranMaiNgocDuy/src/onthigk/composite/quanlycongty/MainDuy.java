package onthigk.composite.quanlycongty;

public class MainDuy {
  public static void main(String[] args) {
    CongTyDuy congTy = new NoiLamViecDuy("ABC");
    CongTyDuy p1 = new NoiLamViecDuy("Phòng ban 1");
    CongTyDuy p2 = new NoiLamViecDuy("Phòng ban 2");
    CongTyDuy t1= new NoiLamViecDuy("Tổ 1");
    CongTyDuy t2 = new NoiLamViecDuy("Tổ 2");
    CongTyDuy t3 = new NoiLamViecDuy("Tổ 3");
    CongTyDuy nv1 = new NhanVienDuy("Duy","0","email@gmail.com");
    CongTyDuy nv2 = new NhanVienDuy("An","01","email@gmail.com");
    CongTyDuy nv3 = new NhanVienDuy("Danh","01","email@gmail.com");
    CongTyDuy nv4 = new NhanVienDuy("Dat","01","email@gmail.com");
    congTy.them(p1);
    congTy.them(p2);
    p1.them(t1);
    p1.them(t2);
    p2.them(t3);
    t1.them(nv1);
    t2.them(nv2);
    t3.them(nv3);
    t3.them(nv4);
    System.out.println(congTy.thongTin());
  }
}
