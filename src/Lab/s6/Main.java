package Lab.s6;

public class Main {
    public static void main(String[] args) {
        SNT s = new SNT();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    s.timSNT();


                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }

            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
