package session.s5;

public class SubRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try{
                Thread.sleep(1000); // nghi 1s
            }catch (Exception e){

            }
        }
    }
}
