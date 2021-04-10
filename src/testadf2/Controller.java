package testadf2;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    public void addPassenger() throws Exception{
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println("Nhap id: "+id);
        String passengerName = sc.next();
        System.out.println("Nhap ten: "+passengerName);
        String address = sc.next();
        System.out.println("Nhap dia chi: "+address);
        String phone = sc.next();
        System.out.println("Nhap so dien thoai: "+phone);
        String dateOfDeparture = sc.next();
        System.out.println("Nhap ngay di: "+dateOfDeparture);
        String dateOfReturn = sc.next();
        System.out.println("Nhap ngay den: "+dateOfReturn);
    }

}
