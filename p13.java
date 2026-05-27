public class p13 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static Node front = null;
    static Node rear = null;
    static void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    static void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Removed: " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
    static void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front: " + front.data);
    }
    static void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();
        dequeue();
        peek();
    }
}