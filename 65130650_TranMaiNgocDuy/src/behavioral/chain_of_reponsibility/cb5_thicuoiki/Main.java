package behavioral.chain_of_reponsibility.cb5_thicuoiki;

public class Main {
  public static void main(String[] args) {
    XepLoaiHS yeu = new XepLoai("Yếu", 0, 5);
    XepLoaiHS trungBinh = new XepLoai("Trung bình", 5, 7);
    XepLoaiHS kha = new XepLoai("Khá", 7, 8);
    XepLoaiHS gioi = new XepLoai("Giỏi", 8, 9);
    XepLoaiHS xuatSac = new XuatSac();

    yeu.loaiTren(trungBinh).loaiTren(kha).loaiTren(gioi).loaiTren(xuatSac);
    yeu.XepLoai(5);
    yeu.XepLoai(6);
    yeu.XepLoai(7);
    yeu.XepLoai(8);
    yeu.XepLoai(9);
  }
}
