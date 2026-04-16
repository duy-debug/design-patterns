package onthigk.composite.menumonan;

public class MainDuy {
  public static void main(String[] args) {
    MenuDuy scb = new ComboDuy("Sieucombo");
    MenuDuy cb1 = new ComboDuy("combo1");
    MenuDuy cb2 = new ComboDuy("combo2");
    MenuDuy m1 = new MonAnDuy("Gà rán", 5000);
    MenuDuy m2 = new MonAnDuy("Cá hồi", 1000);
    MenuDuy m3 = new MonAnDuy("Bánh tráng trứng", 2000);
    MenuDuy m4 = new MonAnDuy("Trà sửa", 3000);
    scb.them(m1);
    scb.them(cb1);
    scb.them(cb2);
    cb1.them(m1);
    cb1.them(m2);
    cb1.them(m3);
    cb2.them(m4);
    System.out.println(scb.thongTin());
  }

}
