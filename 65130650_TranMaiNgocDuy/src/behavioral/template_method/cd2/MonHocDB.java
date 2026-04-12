package behavioral.template_method.cd2;

import java.util.ArrayList;

public class MonHocDB extends EntityDB<MonHoc>{

  @Override
  protected int getKey(MonHoc monHoc) {
    return monHoc.getMaMH();
  }
}
