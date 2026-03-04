package structural.composite;

public class Main {
  public static void main(String[] args) {
    BinaryTreeComponent root = new InternalNode(10);
    BinaryTreeComponent node1 = new InternalNode(5);
    BinaryTreeComponent node2 = new InternalNode(8);
    BinaryTreeComponent node3 = new Left(4);
    BinaryTreeComponent node4 = new Left(3);
    BinaryTreeComponent node5 = new Left(9);
    BinaryTreeComponent node6 = new Left(7);
    root.addLeft(node1);
    root.addRight(node2);
    node1.addLeft(node3);
    node1.addRight(node4);
    node2.addLeft(node5);
    node2.addRight(node6);
    root.NLR();
  }
}
