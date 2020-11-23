package Harsh;

public class BinarySearchTree {
    treeNode root;

    public void add(int i){
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
                        break;
                    }
                }else if(val > current.value){
                    if(current.right != null) {
                        current =  current.right;
                    }else{
                        break;
                    }
                }
            }

            if(val < current.value){
                current.left = A;
            }else{
                current.right = A;
            }
        }
    }
}
