package structural.composite.b3;

public class File extends AbstractFile {
  public File(String name) {
    super(name);
  }

  @Override
  public String getStringTreeFolder() {
    return this.prefix + this.name;
  }

  @Override
  public String getPath() {
    return this.path;
  }

  @Override
  public void addItem(AbstractFile f) {

  }
}
