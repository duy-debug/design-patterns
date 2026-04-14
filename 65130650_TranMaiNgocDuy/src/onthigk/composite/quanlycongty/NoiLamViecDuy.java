package onthigk.composite.quanlycongty;

import java.util.ArrayList;

public class NoiLamViecDuy extends CongTyDuy {
  ArrayList<CongTyDuy> noiLamViec = new ArrayList<>();
  public NoiLamViecDuy(String ten) {
    super(ten);
  }
@Override
public String thongTin() {
   StringBuilder builder = new StringBuilder();
   builder.append(this.prefix).append(this.ten);
   for(var noiLam: noiLamViec){
     noiLam.prefix = this.prefix + "   ";
     builder.append("\n").append(noiLam.thongTin());
     noiLam.prefix = "";
   }
   return builder.toString();
}

@Override
public void them(CongTyDuy congTyDuy) {
  noiLamViec.add(congTyDuy);
}

@Override
public void xoa(CongTyDuy congTyDuy) {
  noiLamViec.remove(congTyDuy);
}
}
