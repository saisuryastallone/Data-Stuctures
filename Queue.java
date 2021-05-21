public class Queue {
 private int[] queue;
 private int size;
 private int total;
 private int front;
 private int rear;


    Queue(){
        size=100;
        total=0;
        front=0;
        rear=0;
        queue = new int[size];
    }

    Queue(int size){
        this.size=size;
        total=0;
        front=0;
        rear=0;
        queue = new int[this.size];
    }

    public boolean enqueue(int item){
        if(isFull()){
            return false;
        }
        else{
            queue[rear]=item;
            rear=(rear+1)%size;
            return true;
        }
    }

    public boolean isFull(){
        if(size == total){
            return true;
        }
        else
            return false;
    }

    public int dequeue(){
        total--;
        int item = queue[front];
        front = (front+1)%size;
        return item;

    }

}
