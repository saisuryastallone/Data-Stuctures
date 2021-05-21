public class Linked_List {
    private Node head;

    class Node{
        public int value;
        public Node next;
    }

    //Inserting head node with Constructor
    public Linked_List(int item) {
        head = new Node();
        head.value = item;
        head.next =null;

    }

    //Insertion at the front
    public void insertAtFront(int item) {
        Node first = new Node();
        first.value =item;
        first.next= head;
        head = first;

    }

    //Insertion at the last
    public void insertAtLast(int item) {
        Node last = new Node();
        last.value = item;
        last.next =null;
        Node x = head;
        while(x.next!=null){
            x=x.next;

        }
        x.next = last;
    }

    //Deletion of a node
    public void delete(int item){
        Node n = head;
        Node m=head.next;
        while(n!=null){
            if(n.value==item){
                m.next=n.next;
            }
            m=n;
            n=n.next;
        }
    }

    //Print Elements of LinkedList
    public void printElements() {
        Node z = head;
        while ((z!=null)){
            System.out.println(z.value);
            z=z.next;
        }
    }

}




