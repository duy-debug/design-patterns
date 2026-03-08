package structural.composite.b3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
  List<AbstractFile> file = new ArrayList<>();
  public Folder(String name){
    super(name);
  }

  @Override
  public String getStringTreeFolder() {
    StringBuilder builder = new StringBuilder();
    // 1. Tên của thư mục hiện tại
    builder.append(this.prefix).append(name);
    for(var file: file){
      file.prefix = this.prefix+ " ";
      builder.append("\n").append(file.getStringTreeFolder());
    }
    return builder.toString();
  }

  @Override
  public String getPath() {
    return this.path;
  }

  @Override
  public void addItem(AbstractFile f) {
    for(var file: file){
      if(file.name.equals(f.name)){
        return;
      }
    }
    file.add(f);
    f.path = this.getPath() + "//" + f.name;
  }
}
