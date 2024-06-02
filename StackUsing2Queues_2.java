package pkg;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues_2 {
	
	//Implementation of Stacks Using two Queues
	//Pop Operation Costly
	
	 private Queue<Integer> pushQ = new LinkedList<>();
	    private Queue<Integer> popQ = new LinkedList<>();

	    // Push operation
	    public void push(int x) {
	        pushQ.add(x);
	    }

	    // Pop operation
	    public int pop() {
	        if (pushQ.isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }

	        // Move elements from pushQ to popQ until only one element is left in pushQ
	        while (pushQ.size() > 1) {
	            popQ.add(pushQ.remove());
	        }

	        // Get the last element from pushQ
	        int top = pushQ.remove();

	        // Swap the names of pushQ and popQ
	        Queue<Integer> temp = pushQ;
	        pushQ = popQ;
	        popQ = temp;

	        return top;
	    }

	    // Peek operation
	    public int peek() {
	        if (pushQ.isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }

	        // Move elements from pushQ to popQ until only one element is left in pushQ
	        while (pushQ.size() > 1) {
	            popQ.add(pushQ.remove());
	        }

	        // Get the last element from pushQ
	        int top = pushQ.peek();

	        // Move the last element to popQ
	        popQ.add(pushQ.remove());

	        // Swap the names of pushQ and popQ
	        Queue<Integer> temp = pushQ;
	        pushQ = popQ;
	        popQ = temp;

	        return top;
	    }

	    // Check if the stack is empty
	    public boolean isEmpty() {
	        return pushQ.isEmpty();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsing2Queues_2 stack = new StackUsing2Queues_2();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());  // 3
        System.out.println(stack.peek()); // 2
        System.out.println(stack.pop());  // 2
        System.out.println(stack.isEmpty()); // false

	}

}
