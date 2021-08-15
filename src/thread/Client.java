package thread;

public class Client {

    public static void main(String[] args) {
        Database database = new Database();
        ThreadOne threadOne = new ThreadOne(database);
        ThreadTwo threadTwo = new ThreadTwo(database);
        threadOne.start();
        threadTwo.start();
    }
}
