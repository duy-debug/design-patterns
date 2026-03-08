package structural.composite.b3;

public abstract class AbstractFile {
  String name, path;
  String prefix = "";
  public AbstractFile(String name) {
    this.name = name;
    this.path = this.name;
  }
  public abstract String getStringTreeFolder();
  public String getPath(){
    return this.path;
  }
  public abstract void addItem(AbstractFile f);
}
