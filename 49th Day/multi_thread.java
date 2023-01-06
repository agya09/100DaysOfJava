class ThreadCount extends Thread {
    ThreadCount() {
        super("Overriding Thread Class");
        System.out.println("New thread created " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("New thread created" + this);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Currently executing thread is interrupted");
        }
        System.out.println("Currently executing thread run is terminated");
    }

}

public class multi_thread {
    public static void main(String[] args) {
        ThreadCount c = new ThreadCount();
        try {
            while (c.isAlive()) {
                System.out.println("Main thread alive until child thread is alive");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Main method thread is interrupted");
        }
        System.out.println("Main method thread run is terminated");
    }

}
