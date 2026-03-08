package structural.deccorator.b1;

public class BieuThucDonGian extends BieuThuc {
  private float giaTri;
  public BieuThucDonGian(float giaTri) {
    this.giaTri = giaTri;
  }
  @Override
  public float giaTri() {
    return giaTri;
  }

  @Override
  public String bieuThuc() {
    return giaTri + "";
  }
}
