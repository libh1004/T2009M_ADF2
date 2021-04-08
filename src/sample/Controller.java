//package sample;
//
//import javafx.beans.property.ListProperty;
//import javafx.beans.property.SimpleListProperty;
//import javafx.collections.FXCollections;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.*;
//import sample.model.Student;
//
//import java.io.DataInputStream;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.URL;
//import java.util.*;
//
//public class Controller implements Initializable {
//
//
//    public TextField txtName;
//    public TextField txtAddress;
//    public TextField txtMark;
//    public TextArea Ketqua;
//
//
//    public static boolean flag = true;
//
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//        // can lam gi khi mo app thi viet vao day
//        try{
//            FileInputStream fis  = new FileInputStream("student_data.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            String txt = dis.readLine();
//            String txtTextArea = "";
//            while(txt!=null){
//                txtTextArea+=txt+"\n";
//                txt = dis.readLine();
//            }
//                Ketqua.setText(txtTextArea);
//            }catch (IOException io){
//        }
//
//
//    }
//
//    public void submit(){
//        String n = txtName.getText();
//        String a = txtAddress.getText();
//        String m = txtMark.getText();
//        if(!n.isEmpty() || !a.isEmpty() || !m.isEmpty()){
//            Integer diemthi = Integer.parseInt(m);
//            Student s = new Student(n,diemthi,m);
//
//            ArrayList<Student> studentList = new ArrayList<>();
//            String txt = "";
//            for(Student s:studentList){
//                txt+=s.getName()+"--"+s.getAddress()+"--"+s.getMark()+"--";
//            }
//            Ketqua.setText(txt);
//            txtName.setText("");
//            txtAddress.setText("");
//            txtMark.setText("");
//
//        }
//
//    }
//
//}
