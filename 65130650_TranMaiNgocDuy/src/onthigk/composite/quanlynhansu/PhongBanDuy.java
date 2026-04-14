package onthigk.composite.quanlynhansu;

import java.util.ArrayList;

public class PhongBanDuy extends ThanhVienDuy{
  ArrayList<ThanhVienDuy> thanhVien = new ArrayList<>();
  public PhongBanDuy(String hoTen, String soDienThoai, String email) {
    super(hoTen, soDienThoai, email);
  }
  @Override
  public String getStringTree() {
    StringBuilder builder = new StringBuilder();
    builder.append(this.prefix).append(this.hoTen);
    for(ThanhVienDuy thanhViens : thanhVien){
      String originalPrefix = thanhViens.prefix;
      thanhViens.prefix = this.prefix + "    ";
      builder.append("\n").append(thanhViens.getStringTree());
      thanhViens.prefix = originalPrefix;
    }
    return builder.toString();
  }

  @Override
  public void addItem(ThanhVienDuy thanhVienDuy) {
    thanhVien.add(thanhVienDuy);
  }

  @Override
  public void remove(ThanhVienDuy thanhVienDuy) {
    thanhVien.remove(thanhVienDuy);
  }
}
