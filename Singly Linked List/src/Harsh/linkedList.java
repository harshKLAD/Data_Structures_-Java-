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
}
