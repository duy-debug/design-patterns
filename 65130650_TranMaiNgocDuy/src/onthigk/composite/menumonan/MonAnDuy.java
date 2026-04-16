package onthigk.composite.menumonan;

public class MonAnDuy extends MenuDuy {
  private String tenMonAn;
  private double gia;

  public MonAnDuy(String tenMonAn, double gia) {
    this.tenMonAn = tenMonAn;
    this.gia = gia;

  }

  @Override
  public String thongTin() {
    return this.prefix + this.tenMonAn +" " + this.gia;
  }

  @Override
  public void them(MenuDuy menuDuy) {

  }

  @Override
  public double tinhTong(MenuDuy menuDuy) {
    return this.gia;
  }
}
