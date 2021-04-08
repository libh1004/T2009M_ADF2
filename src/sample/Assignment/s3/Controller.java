package sample.Assignment.s3;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.sql.*;

public class Controller implements Initializable{
    public TextField txtId;
    public TextField txtName;
    public TextField txtPhone;
    public TextField txtAddress;
    public TextField txtSalary;
    public TextArea ketqua;

    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
    public final static String username = "root";
    public final static String password = "";

    public ArrayList<NhanVien> ds = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,username,password);
            Statement stt = conn.createStatement();
            String txt_sql = "select * from nhanvien";
            ResultSet rs = stt.executeQuery(txt_sql);
            String txt = "";
            while (rs.next()){
                txt += rs.getInt("id");
                txt += "--"+rs.getString("name");
                txt += "--"+rs.getString("phone");
                txt += "--"+rs.getString("address");
                txt += "--"+rs.getDouble("salary");
                txt +="\n";
            }
            ketqua.setText(txt);
        }catch (ClassNotFoundException cn){
            System.out.println("Class not found");
        }catch (SQLException se){
            System.out.println("Connect error");
        }
    }

    public void submit(){
        String i = txtId.getText();
        String n = txtName.getText();
        String p = txtPhone.getText();
        String a = txtAddress.getText();
        String s = txtSalary.getText();

       if(!i.isEmpty()&&!n.isEmpty()&&!p.isEmpty()&&!a.isEmpty()&&!s.isEmpty()) {
           Integer maso = Integer.parseInt(i);
           Double luong = Double.parseDouble(s);
           ds.add(new NhanVien(maso, n, p, a, luong));


           try {
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection(connectString, username, password);
               Statement stt = conn.createStatement();
               String txt_sql = "insert into nhanvien(id,name,phone,address,salary)" + "values(" + i + "," + n + "," + p + "," + a + "," + s + ")";
               stt.execute(txt_sql);
               String txt_sql2 = "select * from nhanvien";
               ResultSet rs = stt.executeQuery(txt_sql2);

               String txt = "";
               while (rs.next()) {
                   txt += rs.getInt("id");
                   txt += "--" + rs.getString("name");
                   txt += "--" + rs.getString("phone");
                   txt += "--" + rs.getString("address");
                   txt += "--" + rs.getDouble("salary");
                   txt += "\n";
               }
               ketqua.setText(txt);
           } catch (ClassNotFoundException cn) {
               System.out.println("Class not found");
           } catch (SQLException se) {
               System.out.println("Connect error");
           }

           String txt = "";
           for (NhanVien nv : ds) {
               txt += nv.getId() + "--" + nv.getName() + "--" + nv.getPhone() + "--" + nv.getAddress() + "--" + nv.getSalary() + "\n";
           }
           ketqua.setText(txt);

       }
    }
}