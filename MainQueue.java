package Exercise_2;

import java.util.Scanner;
public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the circular queue: ");
        int size = sc.nextInt();

        CircularQueue cq = new CircularQueue(size);

        // Initial insert
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element to insert: ");
            int val = sc.nextInt();
            cq.insert(val);
        }

        // Try inserting when full
        System.out.print("Enter new element to insert: ");
        cq.insert(sc.nextInt());

        // Remove one element
        int removed = cq.remove();
        System.out.println("Removing: " + removed);

        // Insert again (circular behavior)
        System.out.print("Enter new element to insert: ");
        cq.insert(sc.nextInt());

        // Try inserting again
        System.out.print("Enter another element to insert: ");
        cq.insert(sc.nextInt());

        sc.close();
    }
}