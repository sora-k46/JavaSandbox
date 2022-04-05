
public class BinaryTreeNode {

    private int info;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode(int info, BinaryTreeNode left, BinaryTreeNode right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }
}
