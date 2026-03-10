package behavioral.chain_of_reponsibility.f88;

public class NhanVienChoVay extends NhanVienF88 {
  NhanVienF88 capTren;

  public NhanVienChoVay(String ten, String chucVu, int hanMucDuyetVay) {
    super(ten, chucVu, hanMucDuyetVay);
  }

  @Override
  public void duyetChoVay(int khoanVay) {
    if (khoanVay <= hanMucDuyetVay)
      System.out.println(this.ten + " " + this.chucVu + " đã duyệt cho vay " + khoanVay + " triệu đồng");
    else
      this.capTren.duyetChoVay(khoanVay);
  }
  @Override
  public NhanVienF88 capTren(NhanVienF88 capTren) {
    this.capTren = capTren;
    return this.capTren;
  }
}
