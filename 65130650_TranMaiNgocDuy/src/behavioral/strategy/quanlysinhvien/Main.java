package behavioral.strategy.quanlysinhvien;

public class Main {
  public static void main(String[] args) {
    QLSV qlsv = new QLSV();

    qlsv.themSV(new SinhVien("An", "30/1/2001",8.5));
    qlsv.themSV(new SinhVien("Bình","30/1/2002", 7.0));
    qlsv.themSV(new SinhVien("Cường","30/1/2003", 9.0));
    qlsv.themSV(new SinhVien("Dũng", "30/1/2004",6.8));

    System.out.println("Danh sách sắp xếp theo tên:");
    qlsv.setSoSanh(new SoSanhTheoTen());
    qlsv.sapXep();
    qlsv.inDS();

    System.out.println("\nDanh sách sắp xếp theo điểm:");
    qlsv.setSoSanh(new SoSanhTheoDiem());
    qlsv.sapXep();
    qlsv.inDS();
  }
}
