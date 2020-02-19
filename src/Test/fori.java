package Test;

public class fori {
    public static void main(String args[]){
        int num=0;
        int count =0;
        int a=3,b=2,c=2;
        temp temp = new temp();
        int d=temp.sum(a,b,c);
        System.out.println(d);
        for (int i=0 ;i<=100;i++){
            num = num +i;
            count=count++;
        }
        System.out.println(count*num);
    }

}

