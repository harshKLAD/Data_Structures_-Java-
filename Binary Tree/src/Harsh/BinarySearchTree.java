package Harsh;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinarySearchTree {
    treeNode root;

    public void insert(int i){
        treeNode A = new treeNode();
        A.value = i;
        boolean end = false;

        int val = A.value;
        treeNode current = root;

        if(root == null){
            root = A;
        }else{
            while (true){
                if(val == current.value){
                    System.out.println("Number Already Present : " + val);
                    return;
                }else if(val < current.value){
                    if(current.left != null){
                        current =  current.left;
                    }else{
                        current.left = A;
                        return;
                    }
                }else if(val > current.value){
                    if(current.right != null) {
                        current =  current.right;
                    }else{
                        current.right = A;
                        return;
                    }
                }
            }
        }
    }

    public boolean search(int x){
        if(root == null){
            return false;
        }else{
            treeNode current = root;

            while (true){
                if(x == current.value){
                    return true;
                }else if(x < current.value){
                    if(current.left != null){
                        current =  current.left;
                    }else{
                        return false;
                    }
                }else if(x > current.value){
                    if(current.right != null) {
                        current =  current.right;
                    }else{
                        return false;
                    }
                }
            }
        }
    }

    public void preOrder(treeNode root){
        if(root == null){
            return;
        }else{
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(treeNode root){
        if(root == null){
            return;
        }else{
            inOrder(root.left);
            System.out.println(root.value);
            inOrder(root.right);
        }
    }

    public void postOrder(treeNode root){
        if(root == null){
            return;
        }else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
        }
    }

    public int maxDepth(treeNode root){
        if(root == null){
            return 0;
        }else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }

    public void breadthFirstTraversal(treeNode root){
        Queue<treeNode> queue = new LinkedList<treeNode>();

        treeNode current = new treeNode();
        current = root;
        queue.add(current);

        if(current == null){
            return;
        }else{
            while (queue.size() > 0){
                current = queue.remove();

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
                System.out.println(current.value);
            }

        }
    };

}
