package behavioral.chain_of_reponsibility.cb5_thicuoiki;

public abstract class XepLoaiHS {
  protected final String ten;
  protected final float nguongMin;
  protected final float nguongMax;
  protected XepLoaiHS loaiTren;

  public XepLoaiHS(String ten, float nguongMin, float nguongMax) {
    this.ten = ten;
    this.nguongMin = nguongMin;
    this.nguongMax = nguongMax;
  }

  public XepLoaiHS loaiTren(XepLoaiHS loaiTren) {
    this.loaiTren = loaiTren;
    return loaiTren;
  }

  public XepLoaiHS loaiTren() {
    return loaiTren;
  }

  public String getTen() {
    return ten;
  }

  protected boolean trongNguong(float diem) {
    return diem >= nguongMin && diem < nguongMax;
  }

  public abstract void XepLoai(float diem);
}
