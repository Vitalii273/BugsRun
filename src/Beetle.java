import java.util.Random;

public class Beetle extends Thread {
    private String name;

    public Beetle(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(new Random().nextInt((500) + 500));
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (TestBeetle.name == null) {
            TestBeetle.name = name;
        }

    }
}
