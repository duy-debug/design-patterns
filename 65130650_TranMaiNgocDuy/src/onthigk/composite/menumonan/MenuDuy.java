package onthigk.composite.menumonan;

public abstract class MenuDuy {
  public String prefix="", tenCombo;

  public MenuDuy(String tenCombo) {
    this.tenCombo = tenCombo;
  }

  public MenuDuy() {
  }

  public abstract String thongTin();
  public abstract void them(MenuDuy menuDuy);
  public abstract double tinhTong(MenuDuy menuDuy);
}
