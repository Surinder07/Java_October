package dec16.basicExceptions;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000); // This might throw InterruptedException
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });

        thread.start();
        thread.interrupt(); // This will interrupt the sleeping thread
    }
}
