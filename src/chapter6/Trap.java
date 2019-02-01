package chapter6;

public class Trap {
    public static void main(String args[]){
        int b[][] = new int [][]{{1},{2,3},{4,5,6}};
        int len=b.length;
        for (int i = 0; i < len; i++) {
            for (int k = 0; k < b[i].length; k++) {
                System.out.print(b[i][k]);
            }
            System.out.println();
        }
    }
}
