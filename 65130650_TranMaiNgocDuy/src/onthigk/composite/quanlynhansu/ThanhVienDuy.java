package onthigk.composite.quanlynhansu;

public abstract class ThanhVienDuy {
  public String hoTen, soDienThoai, email;
  String prefix = " ";

  public ThanhVienDuy(String hoTen, String soDienThoai, String email) {
    this.hoTen = hoTen;
    this.soDienThoai = soDienThoai;
    this.email = email;
  }
  public abstract String getStringTree();
  public abstract void addItem(ThanhVienDuy thanhVienDuy);
  public abstract void remove(ThanhVienDuy thanhVienDuy);
}
