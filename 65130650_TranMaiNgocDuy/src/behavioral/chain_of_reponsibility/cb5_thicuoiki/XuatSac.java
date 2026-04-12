package behavioral.chain_of_reponsibility.cb5_thicuoiki;

public class XuatSac extends XepLoaiHS {
  public XuatSac() {
    super("Xuất sắc", 9, 10);
  }

  @Override
  protected boolean trongNguong(float diem) {
    return diem >= nguongMin && diem <= nguongMax;
  }

  @Override
  public void XepLoai(float diem) {
    if (trongNguong(diem)) {
      System.out.println( "Điểm " + diem + " Xếp loại: " + ten);
      return;
    }

    System.out.println("Điểm không hợp lệ: " + diem);
  }
}
