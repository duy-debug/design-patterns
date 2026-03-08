package structural.composite.b3;

public class MainFile {
  public static void main(String[] args) {
    AbstractFile root = new Folder("D/:");
    AbstractFile tailieu = new Folder("TaiLieu");
    AbstractFile laptrinh = new Folder("Laptrinh");
    AbstractFile c = new Folder("c.pptx");
    AbstractFile java = new Folder("java.pptx");
    AbstractFile tienganh = new Folder("tienganh.pptx");
    AbstractFile tiengviet = new Folder("tiengviet.pptx");
    AbstractFile ny = new Folder("ny.jpg");

    root.addItem(laptrinh);
    laptrinh.addItem(c);
    laptrinh.addItem(java);
    root.addItem(tailieu);
    tailieu.addItem(tienganh);
    tailieu.addItem(tiengviet);
    root.addItem(ny);

    System.out.println(root.getStringTreeFolder());
    System.out.println(root.getPath());
  }
}
