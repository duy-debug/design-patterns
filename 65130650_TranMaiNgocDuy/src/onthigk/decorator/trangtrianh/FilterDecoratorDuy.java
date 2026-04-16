package onthigk.decorator.trangtrianh;

public class FilterDecoratorDuy extends DecoratorDuy{
  public FilterDecoratorDuy(String description, TrangTriAnhDuy trangTriAnhDuy) {
    super(description, trangTriAnhDuy);
  }
  @Override
  public String getDescription() {
    return super.getDescription() + ", " + description;
  }
  @Override
  public void hienThiAnh(){
    super.hienThiAnh();
    System.out.println("-> Ap dụng bộ lọc cho màu ảnh");
  }
}
