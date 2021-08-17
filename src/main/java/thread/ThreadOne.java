package thread;

import javax.xml.crypto.Data;

public class ThreadOne extends Thread {

    private Database database;

    public ThreadOne(Database database) {
        this.database = database;
    }

    @Override
    public void run() {
//        database.insert("threadOne");
        database.count("threadOne");
    }

}
