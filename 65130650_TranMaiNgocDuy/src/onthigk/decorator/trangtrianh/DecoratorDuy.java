package onthigk.decorator.trangtrianh;

public class DecoratorDuy extends TrangTriAnhDuy {
  TrangTriAnhDuy trangTriAnhDuy;
  public DecoratorDuy(String description,TrangTriAnhDuy trangTriAnhDuy) {
    super(description);
    this.trangTriAnhDuy = trangTriAnhDuy;
  }
  @Override
  public String getDescription() {
    return trangTriAnhDuy.getDescription();
  }
  @Override
  public void hienThiAnh() {
    trangTriAnhDuy.hienThiAnh();
  }
}
