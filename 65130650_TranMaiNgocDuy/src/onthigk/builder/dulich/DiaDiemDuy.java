package onthigk.builder.dulich;

public class DiaDiemDuy {
  private String tenDiaDiem;
  private String diaChi;
  private String thoiDiemThamQuan;

  public DiaDiemDuy(String tenDiaDiem, String diaChi, String thoiDiemThamQuan) {
    this.tenDiaDiem = tenDiaDiem;
    this.diaChi = diaChi;
    this.thoiDiemThamQuan = thoiDiemThamQuan;
  }

  public DiaDiemDuy() {
  }

  public String getTenDiaDiem() {
    return tenDiaDiem;
  }

  public void setTenDiaDiem(String tenDiaDiem) {
    this.tenDiaDiem = tenDiaDiem;
  }

  public String getDiaChi() {
    return diaChi;
  }


  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getThoiDiemThamQuan() {
    return thoiDiemThamQuan;
  }

  public void setThoiDiemThamQuan(String thoiDiemThamQuan) {
    this.thoiDiemThamQuan = thoiDiemThamQuan;
  }

  @Override
  public String toString() {
    return "DiaDiemDuy{" +
            "tenDiaDiem='" + tenDiaDiem + '\'' +
            ", diaChi='" + diaChi + '\'' +
            ", thoiDiemThamQuan='" + thoiDiemThamQuan + '\'' +
            '}';
  }
}
