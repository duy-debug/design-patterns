package onthigk.singleton.sanpham;

public class Main {
  public static void main(String[] args) {
    GioHangDuy gh = GioHangDuy.getInstance();
    UI ui = new UI();
    UI ui1 = new UI();
    ui.them("1","Tao",1,50);
    ui.them("2","Xoài",10,100);
    gh.in();
  }
}
