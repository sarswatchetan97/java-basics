//class Thread1 implements Runnable {
//    public void run() {
//        for (int i=1; i<=5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

class Thread2 implements Runnable {
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
                for (int i=1; i<=5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Runnable thread2 = () -> {
            for (int i=1; i<=5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

//        thread1.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Thread1 Priority -> " + thread1.getPriority());
//
//        thread2.setPriority(Thread.MIN_PRIORITY);
//        System.out.println("Thread2 Priority -> " + thread2.getPriority());

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.run();
        t2.run();
    }
}
