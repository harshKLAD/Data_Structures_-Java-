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
        tree.insert(0);
        tree.insert(3);

        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);
        System.out.println(tree.root.left.left.value);
        System.out.println(tree.root.left.right.value);
        System.out.println(tree.root.right.left.value);
        System.out.println(tree.root.right.right.value);
        System.out.println(tree.search(80));
        System.out.println(tree.search(44));


    }
}
