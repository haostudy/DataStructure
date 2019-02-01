package chapter4;

public class switchClass {
    public static void main(String[] args){
        String str="明日科技";
        switch (str){
            case "明日":
                System.out.println("library");
            case "明日科技":
                System.out.println("right");
            default:
                    System.out.println("all of above is not right");
        }

    }
}
