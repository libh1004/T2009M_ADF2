//package quanlysinhvien.themsv;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.text.Text;
//import quanlysinhvien.Main;
//import quanlysinhvien.model.SinhVien;
//import sun.misc.InvalidJarIndexException;
//
//import java.net.URL;
//import java.nio.channels.ClosedSelectorException;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//
//    public TableColumn<SinhVien,String> txtName;
//    public TableColumn<SinhVien,Integer> txtAge;
//    public TableColumn<SinhVien, Integer> txtMark;
//
//    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
//    public final static String username = "root";
//    public final static String password = "";
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        // tao 1 mang sinh vien
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(connectString,username,password);
//            Statement stt = conn.createStatement();
//            String txt_sql = "select * from sinhvien";
//            ResultSet rs = stt.executeQuery(txt_sql);
//
////            tbView2.setItems(ds2);
//        }catch (Exception e){
//
//        }
//    }
//
//    public void submit() throws Exception{
////       String n = txtName.getText();
////       String a = txtAge.getText();
////       String m = txtMark.getText();
//        txtName.setCellValueFactory(new PropertyValueFactory<>("name"));
//        txtAge.setCellValueFactory(new PropertyValueFactory<>("age"));
//        txtMark.setCellValueFactory(new PropertyValueFactory<>("mark"));
//
//            try{
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection conn = DriverManager.getConnection(connectString,username,password);
//                Statement stt = conn.createStatement();
//                String txt_sql = "insert into sinhvien(name,age,mark)" + "values('"+name+"',"+tuoi+","+diem+")";
//                stt.execute(txt_sql);
//                String txt_sql2 = "select * from sinhvien";
//                ResultSet rs = stt.executeQuery(txt_sql2);
//
//
////                Parent root = FXMLLoader.load(getClass().getResource("../danhsach/danhsach.fxml"));
////                Main.mainStage.setScene(new Scene(root, 800, 600));
////                Main.mainStage.show();
//            }catch (Exception e){
//
//            }
//        }
//
//    public void back() throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("../trangchu/home.fxml"));
//        Main.mainStage.setScene(new Scene(root, 800, 600));
//        Main.mainStage.show();
//    }
//}
