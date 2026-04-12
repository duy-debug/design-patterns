package behavioral.chain_of_reponsibility.cb5_thicuoiki;

public class XepLoai extends XepLoaiHS {
  public XepLoai(String ten, float nguongMin, float nguongMax) {
    super(ten, nguongMin, nguongMax);
  }

  @Override
  public void XepLoai(float diem) {
    if (trongNguong(diem)) {
      System.out.println("Điểm " + diem +" Xếp loại: " + ten);
      return;
    }

    if (loaiTren != null) {
      loaiTren.XepLoai(diem);
      return;
    }

    System.out.println("Điểm không hợp lệ: " + diem);
  }
}
