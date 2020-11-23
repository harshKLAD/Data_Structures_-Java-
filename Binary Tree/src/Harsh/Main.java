package Harsh;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(70);
        tree.add(60);
        tree.add(2);
        tree.add(80);
        tree.add(0);
        tree.add(3);


        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);
        System.out.println(tree.root.left.left.value);
        System.out.println(tree.root.left.right.value);
        System.out.println(tree.root.right.left.value);
        System.out.println(tree.root.right.right.value);


    }
}
