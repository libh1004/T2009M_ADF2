package session.s8;

import database.Connector;
import model.SinhVienAccessObject;
import model.entity.SinhVien;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // gia su can lay ds sinh vien
        SinhVienAccessObject svao = new SinhVienAccessObject();
        ArrayList<model.entity.SinhVien> ds=svao.getList();
        System.out.println("So luong sinh vien: "+ds.size());
        // tao 1 sinh vien
        SinhVien s = new SinhVien(null, "Nguyen Van Loc",19,5);
        if(svao.create(s)){
            System.out.println("Tao thanh cong");
        }else{
            System.out.println("Tao that bai");
        }

    }
}
