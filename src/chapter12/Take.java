package chapter12;

public class Take {
    public static void main(String args[]){
        try{
            String str =new String("lili");
            System.out.println(str);
            int age = Integer.parseInt("20L");
            System.out.println(age);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("program over");
    }
}
