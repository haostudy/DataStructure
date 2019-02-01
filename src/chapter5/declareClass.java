package chapter5;

public class declareClass {
    String s2 =  new String("good");

    char b[]={'g','o','o','d'};
    String s = new String(b);

    int[] a = new int[10];

    public static void main(String[] args){
        char stuTemp[] = {'s','t','u','d','e','n','t'};
        String student = new String(stuTemp,2,4);
        System.out.println(student);
    }
    char hao[] = {'h','a','o'};
    String haoConsequence=new String(hao);

}
