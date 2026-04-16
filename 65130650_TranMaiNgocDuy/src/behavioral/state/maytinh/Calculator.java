package behavioral.state.maytinh;

public class Calculator {
  int input1, input2;
  String operator;
  CalculatorState state;
  public Calculator() {
    state = new InputState1();
  }

  public void setState(CalculatorState state) {
    this.state = state;
  }

  public boolean operate(){
    return state.operateHandle(this);
  }
}
