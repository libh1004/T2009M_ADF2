package Lab.s5;

import session.s5.SubThread;

public class Main {
    public static void main(String[] args) {
        DemTG d = new DemTG();
        d.start();

//        for(int i=10;i<=0;i--){
//            for(int j=59;j<=0;j--){
//                if()
//                System.out.println(i+":"+j);
//                try{
//                    Thread.sleep(1000);
//                }catch (Exception e){
//
//                }
//            }
//        }

        int min = 10;
        int sec = 0;
        while(min>=0){
            while (sec>=0){
//                System.out.println(min+":"+sec);
                System.out.println((min>=10?min:"0"+min)+":"+(sec>=10 ? sec:"0"+sec));
                sec--;
                try{
                    Thread.sleep(100);
                }catch (Exception e){

                }
            }if(sec<0){
                sec=59;

            }
            min--;
        }
    }
}
