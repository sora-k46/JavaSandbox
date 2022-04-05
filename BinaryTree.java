
public class BinaryTree {

    private BinaryTreeNode root;

    BinaryTree () {
        root = null;
    }

    public BinaryTreeNode getRoot () {
        return root;
    }

    public void insert (int info) {
        BinaryTreeNode node = new BinaryTreeNode(info, null, null);
        if (root == null) {
            root = node;
        } else {
            BinaryTreeNode temp_root = root;
            while (true) {
                if (temp_root.getLeft() == null && node.getInfo() < temp_root.getInfo()) {
                    temp_root.setLeft(node);
                    break;
                } else if (temp_root.getLeft() != null && node.getInfo() < temp_root.getInfo()) {
                    temp_root = temp_root.getLeft();
                    continue;
                }
                if (temp_root.getRight() == null && node.getInfo() >= temp_root.getInfo()) {
                    temp_root.setRight(node);
                    break;
                } else if (temp_root.getRight() != null && node.getInfo() >= temp_root.getInfo()) {
                    temp_root = temp_root.getRight();
                }
            }
        }
    }

    public BinaryTreeNode search (int target) {
        BinaryTreeNode temp_root = root;
        while (temp_root != null && temp_root.getInfo() != target) {
            if (target >= temp_root.getInfo()) {
                temp_root = temp_root.getRight();
            } else {
                temp_root = temp_root.getLeft();
            }
        }
        return temp_root;
    }

    public void printTree (BinaryTreeNode node) {
        if (node == null ) return;
        printTree(node.getLeft());
        System.out.println(node.getInfo());
        printTree(node.getRight());
    }

}
