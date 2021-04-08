package sample;

//import sample.model.Student;

import java.io.*;

public class Student {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("student_data.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes("nguyen van a--18--9\n");
            dos.writeBytes("nguyen van b--18-7\n");
            dos.writeBytes("nguyen van c--18-4\n");
            FileInputStream fis = new FileInputStream("student_data.bin");
            DataInputStream dis = new DataInputStream(fis);

            String txt = "";
            for(;txt!=null;){
                txt = dis.readLine();
                System.out.println(txt);
            }

        }catch (FileNotFoundException f){
            System.out.println("FILE NOT FOUND");
        }catch (IOException io){
            System.out.println("FILE ERROR");
        }

    }
}
