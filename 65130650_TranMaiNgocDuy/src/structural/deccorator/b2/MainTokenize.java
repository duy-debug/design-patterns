package structural.deccorator.b2;

public class MainTokenize {
  public static void main(String[] args) {
    ITokenize iTokenize = new TachTu("Nguyễn Văn Đạt đi chơi gặp 3 con ma. Sợ quá chạy về nhà.");
    System.out.println(iTokenize.tokenize());
    iTokenize = new LoaiBoDauCau(iTokenize);
    System.out.println(iTokenize.tokenize());
    iTokenize = new LoaiBoTuDung(iTokenize);
    System.out.println(iTokenize.tokenize());
  }
}
