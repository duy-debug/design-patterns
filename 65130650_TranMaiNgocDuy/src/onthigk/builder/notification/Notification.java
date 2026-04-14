package onthigk.builder.notification;

public class Notification {
  private String tieuDe, noiDung, bieuTuong, amThanh, doUuTien, nutHanhDong;
  private Notification(BuilderDuy b){
    tieuDe = b.tieuDe;
    noiDung = b.noiDung;
    bieuTuong = b.bieuTuong;
    amThanh = b.amThanh;
    doUuTien = b.doUuTien;
    nutHanhDong = b.nutHanhDong;
  }

  @Override
  public String toString() {
    return "Notification{" +
            "tieuDe='" + tieuDe + '\'' +
            ", noiDung='" + noiDung + '\'' +
            ", bieuTuong='" + bieuTuong + '\'' +
            ", amThanh='" + amThanh + '\'' +
            ", doUuTien='" + doUuTien + '\'' +
            ", nutHanhDong='" + nutHanhDong + '\'' +
            '}';
  }

  public static class BuilderDuy{
    private String tieuDe, noiDung, bieuTuong, amThanh, doUuTien, nutHanhDong;
    public BuilderDuy buildTieuDe(String tieuDe){
      this.tieuDe = tieuDe;
      return this;
    }
    public BuilderDuy buildNoiDung(String noiDung){
      this.noiDung = noiDung;
      return this;
    }
    public BuilderDuy buildBieuTuong(String bieuTuong){
      this.bieuTuong = bieuTuong;
      return this;
    }
    public BuilderDuy buildAmThanh(String amThanh){
      this.amThanh = amThanh;
      return this;
    }
    public BuilderDuy buildDoUuTien(String doUuTien){
      this.doUuTien = doUuTien;
      return this;
    }
    public BuilderDuy buildNutHanhDong(String nutHanhDong){
      this.nutHanhDong = nutHanhDong;
      return this;
    }
    public Notification build(){
      return new Notification(this);
    }
  }
}
