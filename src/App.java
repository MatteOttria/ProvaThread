public class App {
    public static void main(String[] args) throws Exception {
        //thr 1
        Thread thr = new DanMyThread();
        //thr 2
        Thread thr1 = new DinMyThread();
        //thr 3
        Thread thr2 = new DonMyThread();

        //start thr 1,2,3
        thr.start();
        thr1.start();
        thr2.start();

    }
}
