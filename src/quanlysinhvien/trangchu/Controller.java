package quanlysinhvien.trangchu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import quanlysinhvien.Main;

public class Controller {

    public void danhSach() throws Exception{
//         chuyen man hinh trang danh sach
//        Stage st = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/danhsach.fxml"));
        Main.mainStage.setScene(new Scene(root, 800, 600));
        Main.mainStage.show();
    }

    public void themSV() throws Exception{
// chuyen man hinh trang them sinh vien
        Parent root = FXMLLoader.load(getClass().getResource("../themsv/themsv.fxml"));
        Main.mainStage.setScene(new Scene(root, 800, 600));
        Main.mainStage.show();
    }

    public void xoaSV() throws Exception{

    }
}
