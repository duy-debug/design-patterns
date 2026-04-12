package behavioral.template_method.cd2;

import java.util.ArrayList;

public class SinhVienDB <T> extends EntityDB<SinhVien>{

  @Override
  protected int getKey(SinhVien sinhVien) {
    return sinhVien.getMaSV();
  }
}
