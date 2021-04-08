package quanlysinhvien.danhsach;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import quanlysinhvien.Main;
import quanlysinhvien.model.SinhVien;

import java.net.URL;
import java.util.ResourceBundle;
import  java.sql.*;

public class Controller implements Initializable {
    public TableView<SinhVien> tbView;
    public TableColumn<SinhVien,Integer> txtId;
    public TableColumn<SinhVien,String> txtName;
    public TableColumn<SinhVien,Integer> txtAge;
    public TableColumn<SinhVien,Integer> txtMark;

    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
    public final static String username = "root";
    public final static String password = "";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtId.setCellValueFactory(new PropertyValueFactory<>("id"));
        txtName.setCellValueFactory(new PropertyValueFactory<>("name"));
        txtAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        txtMark.setCellValueFactory(new PropertyValueFactory<>("mark"));

        // tao danh sach du lieu ( 1 mang SinhVien)
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,username,password);
            Statement stt = conn.createStatement();
            String txt_sql = "select * from student";
            ResultSet rs = stt.executeQuery(txt_sql);

            // nap vao mang SinhVien
            ObservableList<SinhVien> ds = FXCollections.observableArrayList();
            while (rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Integer mark = rs.getInt("mark");
                SinhVien s = new SinhVien(id,name,age,mark);
                ds.add(s);
            }
            tbView.setItems(ds);
        }catch (Exception e){

        }

    }
    public void back() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../trangchu/home.fxml"));
        Main.mainStage.setScene(new Scene(root, 800, 600));
        Main.mainStage.show();
    }
}
