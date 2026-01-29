package creational.builder.a1;

public class MainHoaDon {
  public static void main(String[] args) {
    HoaDon hd = new HoaDon.Builder()
            .builHeader("HD01","29-01-2025","Duy")
            .addCTHD("Me", 10,45000,0.1)
            .addCTHD("Xoài", 5,1000,0.2)
            .addCTHD("Mắm", 2,5000,0.3)
            .addCTHD("Giấy vs", 10,51000,0.3)
            .build();
    hd.inHD();
  }
}
