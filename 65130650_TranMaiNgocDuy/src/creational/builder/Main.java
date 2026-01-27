package creational.builder;

public class Main {
  public static void main(String[] args) {
    Computer computer = new Computer.Builder()
            .buildCPU("Inter core i5 ")
            .buildRam("32GB")
            .buildStorage("512GB")
            .buildScreen("inches 16")
            .build();
    System.out.println(computer.toString());
  }
}
