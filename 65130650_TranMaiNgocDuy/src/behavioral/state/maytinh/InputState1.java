package behavioral.state.maytinh;

import java.util.Scanner;

public class InputState1 implements CalculatorState {

  @Override
  public boolean operateHandle(Calculator calculator) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số thứ nhất: ");
    String s = scanner.nextLine();
    if (s.equals("q"))
      return false;
    calculator.input1=Integer.parseInt(s);
    calculator.setState(new InputState2());
    return true;
  }
}
