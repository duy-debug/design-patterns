package creational.builder;

public class Computer {
  private String cpu, ram, storage, screen;
  public Computer(Builder builder){
    this.cpu = builder.cpu;
    this.ram = builder.ram;
    this.storage = builder.storage;
    this.screen = builder.screen;
  }
  @Override
  public String toString() {
    return "Builder{" +
            "cpu='" + cpu + '\'' +
            ", ram='" + ram + '\'' +
            ", storage='" + storage + '\'' +
            ", screen='" + screen + '\'' +
            '}';
  }
  public static class Builder {
    public String cpu, ram, storage, screen;
    public Builder buildCPU(String cpu){
      this.cpu = cpu;
      return this;
    }
    public Builder buildRam(String ram){
      this.ram = ram;
      return this;
    }
    public Builder buildStorage(String storage){
      this.storage = storage;
      return this;
    }
    public Builder buildScreen(String screen){
      this.screen = screen;
      return this;
    }
    public Computer build(){
      return new Computer(this);
    }
  }
}
