package javaapplication41;

class Queue {
    int front, rear, items;
    int[] QueueArr;
    int size;

    Queue(int size) {
        this.size = size;
        QueueArr = new int[size];
        front = 0;
        rear = -1;
        items = 0;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == size - 1) {
            rear = -1;
        }
        QueueArr[++rear] = item;
        items++;
        System.out.println("Enqueued item: " + item);
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = QueueArr[front++];
        if (front == size) {
            front = 0;
        }
        items--;
        System.out.println("Dequeued item: " + temp);
        return temp;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return QueueArr[front];
    }

    boolean isFull() {
        return items == size;
    }

    boolean isEmpty() {
        return items == 0;
    }

    int currentSize() {
        return items;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue contents:");
        for (int i = 0; i < items; i++) {
            int index = (front + i) % size;
            System.out.println(QueueArr[index]);
        }
    }
}


public class QueueEx {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(60);
        
        
        queue.display();

        queue.dequeue();
        queue.display();

        System.out.println("Peek value: " + queue.peek());
        System.out.println("Current size: " + queue.currentSize());
    }
}


