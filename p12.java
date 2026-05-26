public class p12 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static Node top = null;
    static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Removed: " + top.data);
        top = top.next;
    }
    static void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top: " + top.data);
    }
    static void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        display();
        pop();
        peek();
    }
}