package timer2;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtMinutes;
    public TextField txtSecond;

    Integer m = 0;
    Integer s = 0;
    boolean runnable = true;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    public void runTimer() {
        while (m >= 0 && runnable) {
            while (s >= 0 && runnable) {
                txtMinutes.setText(m >= 10 ? m.toString() : "0" + m.toString());
                txtSecond.setText(s >= 10 ? s.toString() : "0" + s.toString());
                s--;
                try {
                    Thread.sleep(100);
                } catch (Exception e) {}
            }
            if (s < 0) {
                s = 59;
            }
            if(runnable)
                m--;
        }
    }


    public void start(){
        runnable = true;
        m = Integer.parseInt(txtMinutes.getText());
        s = Integer.parseInt(txtSecond.getText());
        Runnable r = new Runnable() {
            @Override
            public void run() {
                runTimer();
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    public void stop(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                runnable = !runnable;
                if(runnable) {
                    runTimer();
                }else{
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    public void reset(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                runnable = false;
                m = 0;
                s = 0;
                txtMinutes.setText(m>=10?m.toString():"0"+m.toString());
                txtSecond.setText(s>=10?s.toString():"0"+s.toString());
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

}



