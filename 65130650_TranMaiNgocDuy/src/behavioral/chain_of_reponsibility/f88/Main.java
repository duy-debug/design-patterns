package behavioral.chain_of_reponsibility.f88;

public class Main {
  public static void main(String[] args) {
    NhanVienF88 cv = new NhanVienChoVay("Nhã", "Chuyên viên kĩ thuật",10000000);
    NhanVienF88 gd = new NhanVienChoVay("Ngọc Duy", "Tổng giám đốc",1000000000);
    NhanVienF88 tp = new NhanVienChoVay("Qúy", "Phó Tổng Giám Đốc",100000);
    NhanVienF88 ct = new ChuTich("Nguyễn Văn Đạt", "Chủ tịch",50000000);
    NhanVienF88 bv1 = new NhanVienChoVay("Duy Tấn", "Bảo vệ",2000000);
    NhanVienF88 ce = new NhanVienChoVay("Đức Mạnh", "Chief Engineer",10000000);
    cv.capTren(ce).capTren(tp).capTren(gd).capTren(ct);
    cv.duyetChoVay(200000000);
    cv.duyetChoVay(1000000000);
    cv.duyetChoVay(1500000000);
  }
}
