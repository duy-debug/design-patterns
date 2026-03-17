package behavioral.observer.ca5_atm;

public class ATM {
  public ATMListener taiKhoan;
  public void nhanThe(ATMListener atm){
    this.taiKhoan = atm;
    System.out.println("Thẻ đã được được vào ATM");
  }
  public void traThe(){
    System.out.println("Thẻ đã được trả lại");
    taiKhoan = null;
  }
  public void rutTien(int soTienRut){
    if(taiKhoan == null){
      System.out.println("Không có thẻ trong ATM");
      return;
    }
    if(taiKhoan.kiemTraSoDu(soTienRut)){
      taiKhoan.nhanThongBao(soTienRut, true);
    }
    else{
      taiKhoan.nhanThongBao(soTienRut, false);
    }
  }
}
