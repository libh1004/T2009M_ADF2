package session.s6;

public class DemoSync {
    public static void main(String[] args) {
        NumberCount n = new NumberCount();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<20;i++){
//                    synchronized (n) { // khoa de ko chay dc vao pham vi
                          // n la 1 o nho
                        n.changeXY();
                        n.showXY();
//                    }

                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }

            }
        };
        Thread t = new Thread(r);


        Thread t2 = new Thread(r);
        t.start();
        t2.start();

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<20;i++){
//                    synchronized (n) { // khoa de ko chay dc vao pham vi
                    // n la 1 o nho
                    n.printZ();
//                    }
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }

            }
        };
        Thread t3 = new Thread(r3);
    }
}
