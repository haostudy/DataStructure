package chapter15;

import java.io.File;

public class FileTest1 {
    public static void main(String args[]){
        File file = new File("word.txt");
        if(file.exists()){
            String name =file.getName();
            long length = file.length();
            boolean hide =file.isHidden();
            System.out.println("文件名称"+name);
            System.out.println("文件大小"+length);
            System.out.println("文件是否隐藏："+hide);
        }else {
            System.out.println("文件不存在");
        }
    }
}
