package behavioral.state.maytinh;
import java.util.Scanner;

public class InputState2 implements CalculatorState {
  @Override
  public boolean operateHandle(Calculator calculator) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số thứ hai: ");
    String s = scanner.nextLine();
    calculator.input2 = Integer.parseInt(s);
    calculator.setState(new InputOperationState());
    return true;
  }
}
