package onthigk.decorator.goicuoc;

public class GoiCuocDuy implements DangKyGoiCuoc {
  String tenGoi;
  double giaCuoc;

  public GoiCuocDuy(String tenGoi, double giaCuoc) {
    this.tenGoi = tenGoi;
    this.giaCuoc = giaCuoc;
  }

  @Override
  public double tinhTong() {
    return giaCuoc;
  }

  @Override
  public String getDescription() {
    return "Đã đăng ký thành công gói cước cơ bản\nGiá gói cước cơ bản là: " + giaCuoc + "\n";
  }
}
