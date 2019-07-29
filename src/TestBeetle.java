
public class TestBeetle {
    static String name = null;

    public static void main(String[] args) throws InterruptedException {

        Thread[] beetles = new Thread[10];
        for (int i = 0; i < beetles.length; i++) {
            (beetles[i] = new Thread(new Beetle("Beetle # " + i))).start();
        }
        for (int i = 0; i < beetles.length && name == null; i++) {
            beetles[i].join();
        }
        System.out.println("Winner = " + " " + name);

    }

}
