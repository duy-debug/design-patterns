package behavioral.observer.ca5_atm;

public class TaiKhoan implements ATMListener{
  String tenTaiKhoan;
  int soDu;
  ATM atm;

  public TaiKhoan(String tenTaiKhoan, int soDu) {
    this.tenTaiKhoan = tenTaiKhoan;
    this.soDu = soDu;
  }

  @Override
  public boolean kiemTraSoDu(int soTienRut) {
    return soDu - soTienRut >= 50;
  }

  @Override
  public void nhanThongBao(int soTienRut, boolean thanhCong) {
    if(thanhCong){
      System.out.println("Tên tài khoản: "+tenTaiKhoan+". Số dư hiện tại: " + soDu);
      soDu = soDu - soTienRut;
      System.out.println("Rút tiền thành công là " +soTienRut+". Số dư còn lại là: " + soDu);
    }
    else{
      System.out.println("Rút tiền thất bại. Số dư còn lại là:" + soDu);
    }
  }
  public void duaThe(){
    atm.nhanThe(this);
  }
  public void rutThe(){
    atm.traThe();
  }
}
