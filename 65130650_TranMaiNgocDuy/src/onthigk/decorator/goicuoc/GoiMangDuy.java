package onthigk.decorator.goicuoc;

public class GoiMangDuy extends DecoratorDuy{
  public GoiMangDuy(DangKyGoiCuoc dangKyGoiCuoc) {
    super(dangKyGoiCuoc);
  }
  @Override
  public double tinhTong() {
    return dangKyGoiCuoc.tinhTong() + 20;
  }

  @Override
  public String getDescription() {
    return dangKyGoiCuoc.getDescription() +"Đã thêm gọi mạng + 20\n";
  }
}
