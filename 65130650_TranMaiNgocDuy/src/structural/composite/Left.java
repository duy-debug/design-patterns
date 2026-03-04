package structural.composite;

public class Left extends BinaryTreeComponent {
  BinaryTreeComponent left, right;
  public Left(int value){
    super(value);
  }
  @Override
  public void NLR() {
    System.out.println(value);
    if (left!= null)
      left.NLR();
    if (right!=null)
      right.NLR();
  }

  @Override
  public void addLeft(BinaryTreeComponent c) {
    left = c;
  }

  @Override
  public void addRight(BinaryTreeComponent c) {
    right = c;
  }
}
