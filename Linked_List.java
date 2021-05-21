public class Linked_List {
    private Node head;

    class Node{ //Node has a value and next link
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
        first.next= head;      //Set the value of the new node's next to head which holds reference to head node
        head = first;          //Update the head to refer to the newly added node

    }
    
    //Insertion at a particular index
    public void insertAt(int index, int item){
        Node n = new Node();
        n.value = item;
        n.next = null;
        Node h = head;
        for (int i=0;i<index-1;i++){    //Use for loop to traverse to a node that corresponds to the given index number 
            h=h.next;                   //h.next within the for loop helps reach that particular node at that given index
        }
        n.next=h.next;                  //First assign the next of node at given index to the newly added added node's next
        h.next=n;                       //Now, assign the next of node at given index to newly added node reference
    }


    //Insertion at the last
    public void insertAtLast(int item) {
        Node last = new Node();
        last.value = item;
        last.next =null;
        Node x = head;           //Initialize a node to head to traverse to the end node
        while(x.next!=null){     //when x.next holds null then we have reached the end node
            x=x.next;

        }
        x.next = last;            //Update the x.next to the newly added node reference variable
    }

    //Deletion of a node
    public void delete(int item){
        Node n = head;             //Initialize a node with head node reference
        Node m=head.next;          //Initialize another node with head node's next so that this refers to one node behind current node used for search
        while(n!=null){
            if(n.value==item){
                m.next=n.next;
            }
            m=n;                    //Again update the lagging node m to current node n for the use in next iteration
            n=n.next;               //Update the current node used for search i.e n to n.next to progress to the next node
        }
    }

    //Print Elements of LinkedList
    public void printElements() {
        Node z = head;               //Initialize a node to head to traverse to the end node
        while ((z!=null)){           //when z holds null then we have reached the end node
            System.out.println(z.value);
            z=z.next;                //Update the value of current node to current node's next i.e. z to z.next to progress to the next node of the linked list
        }
    }

}




