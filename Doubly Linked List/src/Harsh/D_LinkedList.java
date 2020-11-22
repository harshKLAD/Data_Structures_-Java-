package Harsh;

import java.util.HashMap;

public class D_LinkedList {
    //Node temp;
    Node head = null;
    int size;

//    D_LinkedList(){
//        temp = new Node();
//        temp.next = temp;
//        temp.prev = temp;
//        size = 0;
//    }

    public void add(int x){
        Node A = new Node();
        A.value = x;

        Node Y = head;


        if(head == null){
            head = A;
            head.next = A;
            head.prev = A;
        }else{
            while (Y.next != head){
                Y = Y.next;
            }
            Y.next = A;
            A.next = head;
            A.prev = Y;
        }
        size++;
    }

    public void printList(){
        //System.out.println(size);

        Node A = head;

        do{
            System.out.println(A.value);
            A = A.next;
        }
        while(A != head);
    }


}
