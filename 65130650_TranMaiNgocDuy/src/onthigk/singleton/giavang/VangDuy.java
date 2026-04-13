package onthigk.singleton.giavang;

public class VangDuy {
  private String ngay;
  private String loaiVang;
  private double giaMua;
  private double giaBan;

  public VangDuy(String ngay, String loaiVang, double giaMua, double giaBan) {
    this.ngay = ngay;
    this.loaiVang = loaiVang;
    this.giaMua = giaMua;
    this.giaBan = giaBan;
  }

  public String getNgay() {
    return ngay;
  }

  public void setNgay(String ngay) {
    this.ngay = ngay;
  }

  public String getLoaiVang() {
    return loaiVang;
  }

  public void setLoaiVang(String loaiVang) {
    this.loaiVang = loaiVang;
  }

  public double getGiaMua() {
    return giaMua;
  }

  public void setGiaMua(double giaMua) {
    this.giaMua = giaMua;
  }

  public double getGiaBan() {
    return giaBan;
  }

  public void setGiaBan(double giaBan) {
    this.giaBan = giaBan;
  }

  @Override
  public String toString() {
    return "VangDuy{" +
            "ngay='" + ngay + '\'' +
            ", loaiVang='" + loaiVang + '\'' +
            ", giaMua=" + giaMua +
            ", giaBan=" + giaBan +
            '}';
  }
}
