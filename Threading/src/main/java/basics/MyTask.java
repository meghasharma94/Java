package basics;

public class MyTask {
    public static void main(String[] args) {
        System.out.println("Starting Application ----");
        Runnable r = new Task(); // r is runnable reference
        Thread task = new Thread(r); // child thread
        task.start();
        for (int i = 1; i < 10; i++) {
            System.out.println("Printing !! " + i);
        }
    }
}


class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++)
            System.out.println("Hello , Here I am!! " + i + " - Runnable");

    }
}
