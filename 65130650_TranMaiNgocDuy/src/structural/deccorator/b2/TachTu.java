package structural.deccorator.b2;

import java.util.ArrayList;
import java.util.List;

public class TachTu implements ITokenize{
  String s;
  public TachTu(String s){
    this.s = s;
  }
  @Override
  public List<String> tokenize() {
    // Tach tu
  return new ArrayList<>(List.of(s.split(" ")));
  }
}
