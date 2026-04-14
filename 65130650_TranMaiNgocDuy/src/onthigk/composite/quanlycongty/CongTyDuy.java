package onthigk.composite.quanlycongty;

public abstract class CongTyDuy {
  protected String ten, prefix = "";

  public CongTyDuy(String ten) {
    this.ten = ten;
  }
  public abstract String thongTin();
  public abstract void them(CongTyDuy congTyDuy);
  public abstract void xoa(CongTyDuy congTyDuy);
}
