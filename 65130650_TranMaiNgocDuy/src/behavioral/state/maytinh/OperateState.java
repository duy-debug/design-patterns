package behavioral.state.maytinh;

public class OperateState implements CalculatorState{
  @Override
  public boolean operateHandle(Calculator calculator) {
    float kq = 0;
    switch (calculator.operator){
      case "+":kq=calculator.input1+calculator.input2; break;
      case "-":kq=calculator.input1-calculator.input2; break;
      case "x":kq=calculator.input1*calculator.input2; break;
      case "/":kq= (float)calculator.input1/calculator.input2; break;
      default:kq=0;
    }
    System.out.println(calculator.input1 + calculator.operator + calculator.input2 +" = "+kq);
    calculator.setState(new InputState1());
    return true;
  }
}
