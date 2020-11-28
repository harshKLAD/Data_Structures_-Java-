package Harsh;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println(tree.search(80));

        tree.insert(5);
        tree.insert(2);
        tree.insert(70);
        tree.insert(60);
        tree.insert(2);
        tree.insert(80);
        tree.insert(1);
        tree.insert(0);
        tree.insert(3);
        tree.insert(100);
        tree.insert(76);
        tree.insert(3003);

        tree.preOrder(tree.root);
        System.out.println(" ");
        tree.inOrder(tree.root);
        System.out.println(" ");
        tree.postOrder(tree.root);
        System.out.println(" ");
        System.out.println(tree.maxDepth(tree.root));
    }
}
