package chapter14.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class stuUpdate {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<>();
        map.put("01","李同学");
        map.put("02","魏同学");
        Iterator it =map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            Object key =entry.getKey();
            Object value =entry.getValue();
            System.out.println("key is "+ key + " value is "+value);
        }
    }
}
