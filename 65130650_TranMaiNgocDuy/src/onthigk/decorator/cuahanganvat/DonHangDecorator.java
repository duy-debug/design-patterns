package onthigk.decorator.cuahanganvat;

public abstract class DonHangDecorator extends AVKC{
  AVKC donHang;

  public DonHangDecorator(AVKC donHang) {
    this.donHang = donHang;
  }

  @Override
  float TinhTong() {
    return donHang.TinhTong();
  }

  @Override
  void hienThi() {
    donHang.hienThi();
  }
}
