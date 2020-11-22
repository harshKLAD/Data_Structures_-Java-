package Harsh;

public class Main {

    public static void main(String[] args) {
        linkedList Linked_list = new linkedList();

        Node A = new Node();
	    A.value = 20;
		Node B = new Node();
		B.value = 32423;
		Node C = new Node();
		C.value = 54;
		Node D = new Node();
		D.value = 996;

	    Linked_list.add(A);
		Linked_list.add(B);
		Linked_list.add(C);
		Linked_list.add(D);

		Linked_list.printList();

		Linked_list.find(9);
		Linked_list.find(996);
		Linked_list.find(20);
		//System.out.println(Linked_list.head);
    }
}
