class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) System.out.println("Queue Overflow");
        else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
        }
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }
}

public class QueueDemo_Q26 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
