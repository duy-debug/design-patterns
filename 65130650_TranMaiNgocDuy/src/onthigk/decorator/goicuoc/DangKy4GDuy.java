package onthigk.decorator.goicuoc;

public class DangKy4GDuy extends DecoratorDuy{
  public DangKy4GDuy(DangKyGoiCuoc dangKyGoiCuoc) {
    super(dangKyGoiCuoc);
  }
  @Override
  public double tinhTong() {
    return dangKyGoiCuoc.tinhTong() + 10;
  }

  @Override
  public String getDescription() {
    return dangKyGoiCuoc.getDescription() +"Đã thêm đăng ký 4G + 10\n";
  }
}
