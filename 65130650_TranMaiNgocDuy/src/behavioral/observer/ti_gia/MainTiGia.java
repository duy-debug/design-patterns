package behavioral.observer.ti_gia;

public class MainTiGia {
  public static void main(String[] args) {
    TiGia t = new TiGia();
    NhaDauTu a = new NhaDauTuA("Văn Đạt",t);
    NhaDauTu b = new NhaDauTuB("Tân",t);
    System.out.println("Lần 1");
    t.notify(5);
    b.huyDangKy();
    System.out.println("Lần 2");
    t.notify(-5);
    b.dangKy();
    System.out.println("Lần 3");
    t.notify(-5);

  }
}
