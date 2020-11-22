package Harsh;

public class linkedList {
    Node head;
    int size;

    public void add(Node x){
        Node Y = head;

        if(head == null){
            head = x;
        }else{
            while (Y.next != null){
                //System.out.println(Y.value);
                Y = Y.next;
            }
            Y.next = x;
        }
        size++;
    }

    public void printList(){
        System.out.println(size);
        Node A = head;

        while(A != null){
            System.out.println(A.value);
            A = A.next;
        }
    }

    public void find(int X){
        Node A = head;
        boolean found = false;
        int Position = 1;

        while(A != null){
            if(A.value == X){
                System.out.println("Value Found: " + X + ", at position " + Position);
                found = true;
                break;
            }
            A = A.next;
            Position++;
        }
        if(!found){
            System.out.println("Value Not found");
        }

    }
}
