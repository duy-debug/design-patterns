package behavioral.state.maytinh;

import java.util.Scanner;

public class InputOperationState implements  CalculatorState{
  @Override
  public boolean operateHandle(Calculator calculator) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập toán tử: ");
    calculator.operator = scanner.nextLine();
    calculator.setState(new OperateState());
    return true;
  }
}
