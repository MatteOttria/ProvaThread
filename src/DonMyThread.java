public class DonMyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("-Don-");
            try {
                sleep(2000);
            } catch (Exception e) {

            } 
        }
    }
}