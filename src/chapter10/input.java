package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class input {
    public static void main(String args[]){
        ArrayList<String> ns = new ArrayList<>();
        do{
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(str.equals("")){
                break;
            }
            ns.add(str);
            System.out.println(str);
        }while (true);
    }
}
