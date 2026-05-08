package Exercise_2;

import java.util.Scanner;

class CircularQueue {
    private int[] queue;
    private int front, rear, maxSize, count;

    public CircularQueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    // Insert element
    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        count++;
    }

    // Remove element
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int temp = queue[front];
        front = (front + 1) % maxSize;
        count--;
        return temp;
    }

    // Peek front
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
}