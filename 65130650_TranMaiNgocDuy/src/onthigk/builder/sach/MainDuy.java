package onthigk.builder.sach;

public class MainDuy {
  public static void main(String[] args) {
    SachDuy s = new SachDuy.BuilderDuy()
            .setTuaDe("Lap trinh huong doi tuong")
            .setSoTrang(55)
            .setTacGia("Tran Mai Ngoc Duy")
            .addChuong("Chuong 1: Gioi thieu")
            .addChuong("Chuong 2: Dong goi")
            .addChuong("Chuong 3: Ke thua")
            .addChuong("Chuong 4: Da hinh")
            .build();
    s.in();
  }
}
