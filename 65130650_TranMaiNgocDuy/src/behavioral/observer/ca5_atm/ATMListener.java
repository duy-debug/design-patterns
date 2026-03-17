package behavioral.observer.ca5_atm;

public interface ATMListener {
  boolean kiemTraSoDu(int soTienRut);
  void nhanThongBao(int soTienRut, boolean thanhCong);
}
