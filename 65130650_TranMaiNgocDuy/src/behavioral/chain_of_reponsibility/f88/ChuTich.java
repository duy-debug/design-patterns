package behavioral.chain_of_reponsibility.f88;

public class ChuTich extends NhanVienF88 {
  public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
    super(ten, chucVu, hanMucDuyetVay);
  }

  @Override
  public void duyetChoVay(int khoanVay) {
    if (khoanVay <= hanMucDuyetVay) {
      System.out.println(ten + " " + chucVu + " đã duyệt cho vay " + khoanVay + " triệu đồng");
    } else {
      System.out.println("Ra ngân hàng ngay");
    }
  }

  @Override
  public NhanVienF88 capTren(NhanVienF88 capTren) {
    return null;
  }
}
