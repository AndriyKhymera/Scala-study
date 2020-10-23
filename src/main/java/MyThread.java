public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public synchronized void run() {
//        super.start();
        int counter = 0;
        while (true){
            System.out.println(getName() + "Inside my thread");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
        }
    }
}
