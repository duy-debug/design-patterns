package behavioral.template_method.cd2;

public class MonHoc {
  public String tenMH, soTC;
  public int maMH;

  public MonHoc(int maMH, String tenMH, String soTC) {
    this.maMH = maMH;
    this.tenMH = tenMH;
    this.soTC = soTC;
  }

  public int getMaMH() {
    return maMH;
  }

  public void setMaMH(int maMH) {
    this.maMH = maMH;
  }

  public String getTenMH() {
    return tenMH;
  }

  public void setTenMH(String tenMH) {
    this.tenMH = tenMH;
  }

  public String getSoTC() {
    return soTC;
  }

  public void setSoTC(String soTC) {
    this.soTC = soTC;
  }

  @Override
  public String toString() {
    return "MonHocDB{" +
            "maMH='" + maMH + '\'' +
            ", tenMH='" + tenMH + '\'' +
            ", soTC='" + soTC + '\'' +
            '}';
  }
}
