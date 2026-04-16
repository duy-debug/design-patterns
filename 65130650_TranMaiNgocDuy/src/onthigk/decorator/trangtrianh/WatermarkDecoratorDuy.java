package onthigk.decorator.trangtrianh;

public class WatermarkDecoratorDuy extends DecoratorDuy {

  public WatermarkDecoratorDuy(String description, TrangTriAnhDuy trangTriAnhDuy) {
    super(description, trangTriAnhDuy);
  }
  @Override
  public String getDescription() {
    return super.getDescription() + ", " + description;
  }
  @Override
  public void hienThiAnh() {
    super.hienThiAnh();
    System.out.println("-> Chèn ảnh watermark vào ảnh");
  }
}
