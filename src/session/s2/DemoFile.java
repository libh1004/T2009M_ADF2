package session.s2;

import java.io.*;

public class DemoFile {
    public static void main(String[] args) {
        try {

            // write file
            FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeChars("xin chao, day la noi dung vua ghi lai\n");
            dos.writeChars("xin chao, day la noi dung vua ghi lai lan 2\n");
            // read file
            FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis);
            String txt="";
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
