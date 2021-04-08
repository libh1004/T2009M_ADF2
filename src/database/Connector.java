package database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import quanlysinhvien.model.SinhVien;

import java.sql.*;
public class Connector {
    // lam viec voi db: ket noi , truy van

    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
    public final static String username = "root";
    public final static String password = "";

    public Statement statement;

    // b2. define static variable
    private static Connector instance;
    // b1. private Contructor
    private Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,username,password);
            Statement stt = conn.createStatement();
            statement = stt;

        }catch (ClassNotFoundException cn){
            System.out.println("Class not found");
        }catch (SQLException se){
            System.out.println("Connect error");
        }
    }

    // b3. define static function
    public static Connector getInstance(){
        if(instance == null)
            instance = new Connector();
        return instance;
    }
    public Statement getStatement(){
        return statement;
    }

}
