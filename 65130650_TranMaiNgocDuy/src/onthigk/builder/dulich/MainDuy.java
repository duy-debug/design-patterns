package onthigk.builder.dulich;

public class MainDuy {
  public static void main(String[] args) {
    TourDuy t = new TourDuy.BuilderDuy()
            .setTenTour("Dang Cap Vip Pro")
            .setGiaTien(5000)
            .setThoiGian("3 ngày")
            .addDiaDiem("Da Lat","Lam Dong","1 ngày")
            .addDiaDiem("Khanh Vinh","Khanh Hoa","1 ngày")
            .addDiaDiem("Nha Trang","Khanh Hoa","1 ngày")
            .build();
    t.in();
  }
}
