package creational.singleton.a6;

public class SanPham {
  private String maSanPham, tenSanPham;
  private int soLuong;
  private double donGio;

  public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGio) {
    this.maSanPham = maSanPham;
    this.tenSanPham = tenSanPham;
    this.soLuong = soLuong;
    this.donGio = donGio;
  }

  public String getMaSanPham() {
    return maSanPham;
  }

  public void setMaSanPham(String maSanPham) {
    this.maSanPham = maSanPham;
  }

  public String getTenSanPham() {
    return tenSanPham;
  }

  public void setTenSanPham(String tenSanPham) {
    this.tenSanPham = tenSanPham;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
  }

  public double getDonGio() {
    return donGio;
  }

  public void setDonGio(double donGio) {
    this.donGio = donGio;
  }

  @Override
  public String toString() {
    return "SanPham{" +
            "maSanPham='" + maSanPham + '\'' +
            ", tenSanPham='" + tenSanPham + '\'' +
            ", soLuong=" + soLuong +
            ", donGio=" + donGio +
            '}';
  }
}
