package onthigk.decorator.trangtrianh;

public abstract class TrangTriAnhDuy {
  String description;
  public TrangTriAnhDuy(String description) {
    this.description = description;
  }
  public abstract void hienThiAnh();    //Hàm trả về ảnh
  public String getDescription(){
    return description;
  }
}
