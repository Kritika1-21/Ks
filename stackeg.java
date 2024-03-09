class stc{
    int a[10];
    int count;
    
    stc(){
        count+=-1;
    
    }
    void push(){
        count +=1;
        a[count]= item;
    }
    int pop(){
         return a[count--];
    }
    
}
public class stackeg {
    public static void main(String[] args){
       stc obj= new stc();
       obj.push(1);
       obj.push(2);
       obj.push(3);
       obj.push(4);
       obj.push(5);
       obj.push(6);
       obj.push(7);
       obj.push(8);
       obj.push(9);
       obj.push(10);
       System.out.println(obj.pop());
        }
    }

// Stack implementation in Java
class Stack {
    private int arr[]; // store elements of stack
    private int top; // represent top of stack
    private int capacity; // total capacity of the stack

    // Creating a stack
    Stack(int size) {
        // initialize the array
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            // terminates the program
            System.exit(1);
        }
        // insert element on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // pop elements from top of stack
    public int pop() {
        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }
        // pop element from top of stack
        return arr[top--];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("Stack: ");
        stack.printStack();
        // remove element from stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();
    }
}
