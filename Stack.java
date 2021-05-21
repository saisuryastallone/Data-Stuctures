public class Stack {
    private int[] stack;
    private int top;
    private int size;
    public Stack(){
        top=-1;
        size=50;
        stack = new int[size];
    }
    public Stack(int size){
        top =-1;
        this.size = size;
        stack = new int[this.size];
    }

    public boolean push(int item){
        if(!isFull()){
            top++;
            stack[top] = item;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(){
        if(top==stack.length-1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty(){
            return (top==-1);
    }

    public int pop(){
        return stack[top--];  //After popping the top element, the top should be decremented

    }

    public int peek(){
        return stack[top];
    }

    public int size(){
        return top+1;
    }

}
