package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTest2 {
    public static void main(String args[]){
        File file = new File("word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);

            byte buy[] = "我有一只小毛驴".getBytes();
            out.write(buy);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            FileInputStream in =new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len =in.read(byt);
            System.out.println("文中信息"+
                    new String(byt, 0 ,len));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
