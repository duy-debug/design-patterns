package behavioral.strategy.quanlysinhvien;

public class SinhVien {
  private String hoTen;
  private String ngaySinh;
  private double diemTB;

  public SinhVien(String hoTen, String ngaySinh, double diemTB) {
    this.hoTen = hoTen;
    this.ngaySinh = ngaySinh;
    this.diemTB = diemTB;
  }

  public SinhVien() {

  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(String ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public double getDiemTB() {
    return diemTB;
  }

  public void setDiemTB(double diemTB) {
    this.diemTB = diemTB;
  }

  @Override
  public String toString() {
    return "SinhVien{" +
            "hoTen='" + hoTen + '\'' +
            ", ngaySinh='" + ngaySinh + '\'' +
            ", diemTB=" + diemTB +
            '}';
  }
}
