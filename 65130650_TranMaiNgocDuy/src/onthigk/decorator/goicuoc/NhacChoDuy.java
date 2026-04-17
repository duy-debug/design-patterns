package onthigk.decorator.goicuoc;

public class NhacChoDuy extends DecoratorDuy{
  public NhacChoDuy(DangKyGoiCuoc dangKyGoiCuoc) {
    super(dangKyGoiCuoc);
  }
  @Override
  public double tinhTong() {
    return dangKyGoiCuoc.tinhTong() + 5;
  }

  @Override
  public String getDescription() {
    return dangKyGoiCuoc.getDescription() +"Đã thêm nhạc chờ + 5\n";
  }
}
