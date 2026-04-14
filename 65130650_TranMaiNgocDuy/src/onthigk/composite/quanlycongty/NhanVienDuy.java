package onthigk.composite.quanlycongty;

public class NhanVienDuy extends CongTyDuy{
  private String soDienThoai, email;

  public NhanVienDuy(String ten, String soDienThoai, String email) {
    super(ten);
    this.soDienThoai = soDienThoai;
    this.email = email;
  }

  @Override
  public String thongTin() {
    return this.prefix + this.ten +" " + this.soDienThoai+" " + this.email;
  }

  @Override
  public void them(CongTyDuy congTyDuy) {

  }

  @Override
  public void xoa(CongTyDuy congTyDuy) {

  }
}
