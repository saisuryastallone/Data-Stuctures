
public class Doubly_Linked_List {
	
	Node head,tail = null;

    class Node{ //Node has a value and next link
        public int value;
        public Node next;
        public Node previous;
    }

    //Inserting head node with Constructor
    public Doubly_Linked_List(int item) {
        head = tail = new Node();
        head.value = item;
        tail.next = null;
        head.previous = null;
        

    }

    //Insertion at the front
    public void insertAtFront(int item) {
        Node first = new Node();
        first.value =item;
        first.next= head;      //Set the value of the new node's next to head which holds reference to head node
        first.previous = null;
        head.previous = first;
        head = first;          //Update the head to refer to the newly added node
        
    }
    
    //Insertion at a particular index
    public void insertAt(int index, int item){
        Node n = new Node();
        n.value = item;
        n.next = null;
        n.previous = null;
        
        Node h = head;   
        for (int i=0;i<index;i++){    //Use for loop to traverse to a node that corresponds to the given index number 
            h=h.next;                   //h.next within the for loop helps reach that particular node at that given index
        }
        
        n.next=h.next;                  //First assign the next of node at given index to the newly added added node's next
        n.previous = h;
        h.next=n;                       //Now, assign the next of node at given index to newly added node reference
        h.next.previous = n;
    }


    //Insertion at the last
    public void insertAtLast(int item) {
        Node last = new Node();
        last.value = item;
        
        tail.next = last;
        last.previous = tail;
        tail = last;
        last.next =null;
          
        
    }

    //Deletion of a node
    public void delete(int item){
        Node n = head;             //Initialize a node with head node reference
        while(n!=null){
        	if(n==head && n.value == item) {
        		head = head.next;
        		head.previous = null;
        		break;
        	}
        	
        	else if(n!=head && n!=tail && n.value==item){
            	n.next.previous = n.previous;
            	n.previous.next = n.next;
            	break;
                
            }
        	else if(n == tail && n.value == item) {
            	tail = tail.previous;
            	tail.previous = null;
        		
            	break;
             }
            
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
