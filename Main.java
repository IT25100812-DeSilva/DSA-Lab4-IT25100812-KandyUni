package Exercise_1;

public class Main {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.insert(10);
        q.insert(20);
        q.insert(30);

        System.out.print("Queue elements: ");
        q.display();

        System.out.println("Removed: " + q.remove());

        System.out.print("Queue elements: ");
        q.display();

        System.out.println("Front Element: " + q.peekFront());
        System.out.println("Queue Count: " + q.getCount());
    }
}