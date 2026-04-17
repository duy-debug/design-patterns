package onthigk.decorator.goicuoc;

public class ChuyenVungDuy extends DecoratorDuy{
  public ChuyenVungDuy(DangKyGoiCuoc dangKyGoiCuoc) {
    super(dangKyGoiCuoc);
  }
  @Override
  public double tinhTong() {
    return dangKyGoiCuoc.tinhTong() + 50;
  }

  @Override
  public String getDescription() {
    return dangKyGoiCuoc.getDescription() + "Đã thêm chuyển vùng + 50\n";
  }
}
