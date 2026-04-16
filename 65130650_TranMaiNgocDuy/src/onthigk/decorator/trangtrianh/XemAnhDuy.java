package onthigk.decorator.trangtrianh;

public class XemAnhDuy extends TrangTriAnhDuy{
  public XemAnhDuy(String description){
    super(description);
  }
  @Override
  public void hienThiAnh() {
    System.out.println("Hiển thị ảnh gốc");
  }
}
