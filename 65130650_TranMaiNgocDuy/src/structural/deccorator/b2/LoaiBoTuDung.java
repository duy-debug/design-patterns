package structural.deccorator.b2;

import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
  List<String> tuDungs = List.of("quá","mà","các", "và", "của", "thì", "là", "nhưng", "quá");
  public LoaiBoTuDung(ITokenize tokens){
    super(tokens);
  }

  @Override
  public List<String> tokenize() {
    List<String> t = super.tokenize();
    t.removeAll(tuDungs);
    return t;
  }
}
