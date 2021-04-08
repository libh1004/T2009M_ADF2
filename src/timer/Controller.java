package timer;

import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import session.s5.SubRunnable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Text txtMin;
    public Text txtSec;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Runnable r = new Runnable(){
            public void run(){
                Integer min = 10;
                Integer sec = 0;
                while(min>=0){
                    while (sec>=0){
//                System.out.println(min+":"+sec);
//                System.out.println((min>=10?min:"0"+min)+":"+(sec>=10 ? sec:"0"+sec));
                        txtMin.setText(min>=10?min.toString():"0"+min.toString());
                        txtSec.setText(sec>=10 ? sec.toString():"0"+sec.toString());
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

        };
        Thread t = new Thread(r);
        t.start();

    }
}
