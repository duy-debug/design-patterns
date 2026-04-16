package behavioral.state.maytinh;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    while (true){
      var check = calculator.operate();
      if(check==false){
        break;
      }
    }
  }
}
