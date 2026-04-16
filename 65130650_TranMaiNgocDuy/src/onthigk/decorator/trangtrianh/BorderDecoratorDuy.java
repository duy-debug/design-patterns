package onthigk.decorator.trangtrianh;

public class BorderDecoratorDuy extends DecoratorDuy {
  public BorderDecoratorDuy(String description, TrangTriAnhDuy trangTriAnhDuy) {
    super(description, trangTriAnhDuy);
  }
  @Override
  public String getDescription() {
    return super.getDescription() + ", " +description;
  }

  @Override
  public void hienThiAnh() {
    super.hienThiAnh();
    System.out.println("-> Thêm khung viền cho ảnh");
  }
}
