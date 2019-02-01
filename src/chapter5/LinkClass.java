package chapter5;

public class LinkClass {
    public static void main(String[] args){
        int booktime=2;
        float practiceTime= 3.50f;
        System.out.println("我每天花"+booktime+"个小时看书"+
        ",花"+practiceTime+"小时进行上机练习");
        //------------------------------------------
        String student="we are students";
        int size =student.length();
        System.out.println(size);
        //------------------------------------------
        int position = student.lastIndexOf("t");
        System.out.println(position);

    }
}
