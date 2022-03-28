public class DinMyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5 ; i ++){
            System.out.println("-Din-");
            try {
                sleep(2000);
            } catch (Exception e) {
                
            }
        }
    }
}