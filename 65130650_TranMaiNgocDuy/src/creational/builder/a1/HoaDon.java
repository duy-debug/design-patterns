package creational.builder.a1;
import java.util.ArrayList;
import java.util.List;
public class HoaDon {
  HoaDonHeader header;
  List<CTHD> cthds;

  protected HoaDon(Builder b) {
    this.header = b.header;
    this.cthds = b.cthds;
  }
  public void inHD(){
    System.out.println(header.toString());
    for(var cthd : cthds){
      System.out.println(cthd);
    }
  }
  public static class Builder {
    HoaDonHeader header;
    List<CTHD> cthds = new ArrayList<>();
    public Builder builHeader(String hdId, String ngayBan, String kh){
      header = new HoaDonHeader(hdId, ngayBan, kh);
      return this;
    }
    public Builder addCTHD(String sp, int sl, double dg, double chietKhau){
      cthds.add(new CTHD(sp, sl, dg, chietKhau));
      return this;
    }
    public HoaDon build(){
      return new HoaDon(this);
    }
  }
}
