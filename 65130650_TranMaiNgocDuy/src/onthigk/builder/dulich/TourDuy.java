package onthigk.builder.dulich;

import java.util.ArrayList;

public class TourDuy {
  private String tenTour;
  private double giaTien;
  private String thoiGian;
  private ArrayList<DiaDiemDuy> dsDiaDiem;
 private TourDuy(BuilderDuy builderDuy) {
   this.tenTour = builderDuy.tenTour;
   this.giaTien = builderDuy.giaTien;
   this.thoiGian = builderDuy.thoiGian;
   this.dsDiaDiem = builderDuy.dsDiaDiem;
 }
 public void in(){
   System.out.println(this.tenTour);
   System.out.println(this.giaTien);
   System.out.println(this.thoiGian);
   for(var s: dsDiaDiem){
     System.out.println(s.toString());
   }
 }
 public static class BuilderDuy {
   private String tenTour;
   private double giaTien;
   private String thoiGian;
   private ArrayList<DiaDiemDuy> dsDiaDiem = new ArrayList<>();
   public BuilderDuy() {}
   public BuilderDuy setTenTour(String tenTour) {
     this.tenTour = tenTour;
     return this;
   }
   public BuilderDuy setGiaTien(double giaTien) {
     this.giaTien = giaTien;
     return this;
   }
   public BuilderDuy setThoiGian(String thoiGian) {
     this.thoiGian = thoiGian;
     return this;
   }
   public BuilderDuy addDiaDiem(String tenDiaDiem, String diaChi, String thoiGianThamQuan) {
     dsDiaDiem.add(new DiaDiemDuy(tenDiaDiem,diaChi,thoiGianThamQuan));
     return this;
   }
   public TourDuy build(){
     return new TourDuy(this);
   }
 }
}
