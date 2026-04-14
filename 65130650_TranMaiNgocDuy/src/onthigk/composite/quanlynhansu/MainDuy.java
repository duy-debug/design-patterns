package onthigk.composite.quanlynhansu;

public class MainDuy {
  public static void main(String[] args) {
    PhongBanDuy congTy = new PhongBanDuy("Công ty",
            "0123","email@gmail.com");
    PhongBanDuy phongCNTT = new PhongBanDuy("Phòng IT"
    ,"012345","cntt@gmail.com");
    PhongBanDuy phongMaker = new PhongBanDuy(
            "Phòng makert","012345","maker@gmail.com"
    );
    congTy.addItem(phongCNTT);
    congTy.addItem(phongMaker);
    NhanVienDuy nhanVienCNTT1 = new NhanVienDuy("Duy"
    ,"012345","duy@gmail.com");
    NhanVienDuy nhanVienCNTT2 = new NhanVienDuy("Danh"
            ,"012345","danh@gmail.com");
    NhanVienDuy nhanVienMaker1 = new NhanVienDuy("" +
            "Maker","012345","maker@gmail.com");
    NhanVienDuy nhanVienMaker2 = new NhanVienDuy(
            "Maker1","012345","maker@gmail.com"
    );
    phongCNTT.addItem(nhanVienCNTT1);
    phongCNTT.addItem(nhanVienCNTT2);
    phongMaker.addItem(nhanVienMaker1);
    phongMaker.addItem(nhanVienMaker2);
    System.out.println(congTy.getStringTree());
    phongMaker.remove(nhanVienMaker1);
    System.out.println(congTy.getStringTree());
  }
}
