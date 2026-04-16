package onthigk.composite.menumonan;

import java.util.ArrayList;

public class ComboDuy extends MenuDuy {
  ArrayList<MenuDuy> menuDuys = new ArrayList<>();
  public ComboDuy(String tenCombo) {
    super(tenCombo);
  }
  @Override
  public String thongTin() {
    StringBuilder builder = new StringBuilder();
    builder.append(this.prefix).append(this.tenCombo)
            .append(" Tổng giá: ").append(this.tinhTong(this));
    for(var menuDuy : menuDuys){
      menuDuy.prefix = this.prefix + "    ";
      builder.append("\n").append(menuDuy.thongTin());
      menuDuy.prefix = "  ";
    }
    return builder.toString();
  }

  @Override
  public void them(MenuDuy menuDuy) {
    menuDuys.add(menuDuy);
  }
// Tính tổng gia của một combo bất kì
  @Override
  public double tinhTong(MenuDuy menuDuy) {
    double tinhTong = 0;
    for(var item : menuDuys){
      tinhTong += item.tinhTong(item);
    }
    return tinhTong;
  }
}
