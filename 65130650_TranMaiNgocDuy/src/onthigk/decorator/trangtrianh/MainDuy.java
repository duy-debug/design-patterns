package onthigk.decorator.trangtrianh;

public class MainDuy {
  public static void main(String[] args) {
    TrangTriAnhDuy anh1 = new XemAnhDuy("Ảnh gốc");
    anh1 = new BorderDecoratorDuy("Viền đỏ", anh1);
    anh1 = new WatermarkDecoratorDuy("Tô viền",anh1);
    anh1 = new FilterDecoratorDuy("Sticker", anh1);
    System.out.println("Mô tả: " + anh1.getDescription());
    anh1.hienThiAnh();
  }
}
