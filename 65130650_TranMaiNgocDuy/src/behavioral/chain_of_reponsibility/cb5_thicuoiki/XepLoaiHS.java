package behavioral.chain_of_reponsibility.cb5_thicuoiki;

public abstract class XepLoaiHS {
  String ten;
  float nguongMin, nguongMax;

  public XepLoaiHS(String ten, float nguongMin, float nguongMax) {
    this.ten = ten;
    this.nguongMin = nguongMin;
    this.nguongMax = nguongMax;
  }
  public abstract void XepLoai(float diem);
  public abstract XepLoaiHS loaiTren();
}
