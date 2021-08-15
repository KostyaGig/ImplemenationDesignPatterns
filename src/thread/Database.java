package thread;

public class Database {

    private  int count;

     void insert(String threadName) {
        System.out.println(threadName + "was inserted...");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Insert was worked");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + "was finished work");
    }

      synchronized void count(String threadName) {
        System.out.println(threadName + "was inserted...");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
                if (i == 5 && threadName.equals("threadOne")) {
                    wait();
                }
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println( threadName + "count was worked, count " + count);
    }
}
