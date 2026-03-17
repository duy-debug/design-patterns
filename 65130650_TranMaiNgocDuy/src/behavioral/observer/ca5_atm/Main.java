package behavioral.observer.ca5_atm;

public class Main {
  public static void main(String[] args) {
    ATM atm = new ATM();
    TaiKhoan t = new TaiKhoan("Văn Đạt", 1000);
    atm.nhanThe(t);
    atm.rutTien(20);
    atm.traThe();
    atm.nhanThe(t);
    atm.rutTien(20);
    atm.traThe();
    atm.rutTien(20);
  }
}
