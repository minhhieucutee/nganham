public class MyThread extends Thread {

    @Override
    public void run() {
        // Display name of the current thread.
        System.out.println("Current thread name: " + Thread.currentThread().getName());

        // Rename the thread to myJavaThread and display this name.
        Thread.currentThread().setName("myJavaThread");
        System.out.println("Renamed thread name: " + Thread.currentThread().getName());

        // Display the first 10 even numbers with a delay of 1500ms between each display.
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Creating an instance of MyThread and starting the thread.
        MyThread myThread = new MyThread();
        myThread.start();
    }
}