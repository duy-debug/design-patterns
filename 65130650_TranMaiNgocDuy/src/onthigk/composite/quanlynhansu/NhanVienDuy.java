package onthigk.composite.quanlynhansu;

public class NhanVienDuy extends ThanhVienDuy{
  public NhanVienDuy(String hoTen, String soDienThoai, String email){
    super(hoTen, soDienThoai, email);
  }
  @Override
  public String getStringTree() {
    return this.prefix + this.hoTen + this.soDienThoai + this.email;
  }

  @Override
  public void addItem(ThanhVienDuy thanhVienDuy) {

  }

  @Override
  public void remove(ThanhVienDuy thanhVienDuy) {

  }
}
