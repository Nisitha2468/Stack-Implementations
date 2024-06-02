package pkg;

public class StackUsingArrays {
	
	//Implementation of Stacks Using Arrays
	
	private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArrays(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    
    // Check if the stack is empty
    public Boolean isEmpty() {
    	return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
    	return top == capacity - 1;
    }
    
    // Add elements into stack
    public void push(int value) {
    	if (isFull()) {
    		System.out.println("Stack is full.");
    		System.exit(1);
    	}
    	stack[++top] = value;
    }
    
    // Remove element from stack
    public int pop() {
    	if (isEmpty()) {
    		System.out.println("STACK EMPTY");
    		System.exit(1);
    	}
    	return stack[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingArrays stack = new StackUsingArrays(3);

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Popping elements from the stack
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2

        // Peek at the top element without removing it
        System.out.println(stack.peek()); // 1

	}

}
