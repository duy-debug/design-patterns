package creational.builder.a1;

public class CTHD {
  String sp;
  int sl;
  double dg, chietKhau;

  public CTHD(String sp, int sl, double dg, double chietKhau) {
    this.sp = sp;
    this.sl = sl;
    this.dg = dg;
    this.chietKhau = chietKhau;
  }

  @Override
  public String toString() {
    return "CTHD{" +
            "sp='" + sp + '\'' +
            ", sl=" + sl +
            ", dg=" + dg +
            ", chietKhau=" + chietKhau +
            '}';
  }

  public String getSp() {
    return sp;
  }

  public void setSp(String sp) {
    this.sp = sp;
  }

  public int getSl() {
    return sl;
  }

  public void setSl(int sl) {
    this.sl = sl;
  }

  public double getDg() {
    return dg;
  }

  public void setDg(double dg) {
    this.dg = dg;
  }

  public double getChietKhau() {
    return chietKhau;
  }

  public void setChietKhau(double chietKhau) {
    this.chietKhau = chietKhau;
  }
}
