package StreamApi;

public class Main{
    public static void main(String[] args) {
        // Створюємо перший потік і запускаємо його
        Thread thread1 = new Thread(new MyRunnable("Потік 1"));
        thread1.start();

        // Створюємо другий потік і запускаємо його
        Thread thread2 = new Thread(new MyRunnable("Потік 2"));
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ": " + i);
            try {
                // Пауза для імітації обчислень
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}