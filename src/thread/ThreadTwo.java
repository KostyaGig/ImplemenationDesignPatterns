package thread;

public class ThreadTwo extends Thread {

    private Database database;

    public ThreadTwo(Database database) {
        this.database = database;
    }

    @Override
    public void run() {
//        database.insert("threadTwo");
        database.count("threadTwo");
    }

}
