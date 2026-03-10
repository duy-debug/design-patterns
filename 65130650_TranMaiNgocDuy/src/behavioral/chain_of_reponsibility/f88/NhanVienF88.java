package behavioral.chain_of_reponsibility.f88;

import structural.deccorator.b1.Nhan;

public abstract class NhanVienF88 {
  String chucVu;
  String ten;
  int hanMucDuyetVay;
  public NhanVienF88(String ten, String chucVu, int hanMucDuyetVay) {
    this.chucVu = chucVu;
    this.ten = ten;
    this.hanMucDuyetVay = hanMucDuyetVay;
  }
  abstract public void duyetChoVay(int khoanVay);
  abstract public NhanVienF88 capTren(NhanVienF88 capTren);
}
