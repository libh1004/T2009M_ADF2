package model;
import database.Connector;
import model.entity.SinhVien;

import java.sql.ResultSet;
import java.util.ArrayList;

public class SinhVienAccessObject implements DataAccessObject<model.entity.SinhVien> {
    @Override
    public ArrayList<model.entity.SinhVien> getList() {
        ArrayList<model.entity.SinhVien> list = new ArrayList<model.entity.SinhVien>();
        try {
            // lay tu table SinhVien de nap vao list
            Connector c = Connector.getInstance();
            String txt_sql = "select * from SinhVien";
            ResultSet rs = c.getStatement().executeQuery(txt_sql);
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Integer mark = rs.getInt("mark");
                model.entity.SinhVien s = new SinhVien(id, name, age, mark);
                list.add(s);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public boolean create(model.entity.SinhVien sinhVien) {
        try {
            Connector c = Connector.getInstance();
            String txt_sql = "insert into SinhVien(name,age,mark) values('" + sinhVien.getName() + "'," + sinhVien.getAge() + "," + sinhVien.getMark() + ")";
            c.getStatement().execute(txt_sql);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


        public boolean update (model.entity.SinhVien sinhVien){
            try{
                Connector c = Connector.getInstance();
                String txt_sql = "update SinhVien set name = '"+sinhVien.getName()+"',age="+sinhVien.getAge()+",mark="+sinhVien.getMark()+" where id="+sinhVien.getId();
                c.getStatement().execute(txt_sql);
            }catch (Exception e){
                return false;
            }
            return  true;
        }

        public boolean delete (model.entity.SinhVien sinhVien){
            try{
                Connector c = Connector.getInstance();
                String txt_sql = "delete from SinhVien where id = "+sinhVien.getId();
                c.getStatement().execute(txt_sql);
            }catch (Exception e){
                return false;
            }
            return  true;
        }
    }

