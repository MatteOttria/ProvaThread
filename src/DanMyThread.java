public class DanMyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5 ; i ++){
            System.out.println("-Dan-");
            try {
                sleep(1950);
            } catch (Exception e) {
                
            }
        }
    }
}
