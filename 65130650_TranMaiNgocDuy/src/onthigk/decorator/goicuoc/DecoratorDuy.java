package onthigk.decorator.goicuoc;

public class DecoratorDuy implements DangKyGoiCuoc {
  DangKyGoiCuoc dangKyGoiCuoc;
  public DecoratorDuy(DangKyGoiCuoc dangKyGoiCuoc) {
    this.dangKyGoiCuoc = dangKyGoiCuoc;
  }
  @Override
  public double tinhTong() {
    return dangKyGoiCuoc.tinhTong();
  }

  @Override
  public String getDescription() {
    return dangKyGoiCuoc.getDescription();
  }
}
