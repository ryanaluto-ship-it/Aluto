
package stacklinkedlist;

public class StackLinkedList {


    // Node class
    private class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor
    public StackLinkedList() {
        top = null;
    }
public boolean isEmpty(){
   return top == null;
}
// Push an element into the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("pushed into the Stack.");
    }

    // Remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty!");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    // View the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Display the stack
    public void display() {
    
       if (isEmpty()) {
            System.out.println("Stack is Empty");
          return;
        }
       Node current = top;
       
       System.out.println("Stack Elements");
       
       while (current !=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a stack
        StackLinkedList stack = new StackLinkedList();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        // Display stack
        stack.display();

        // View top element
        System.out.println("Top element: " + stack.peek());

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        // View top again
        System.out.println("Top element: " + stack.peek());

        // Display stack again
        stack.display();
    }
}
    
  
