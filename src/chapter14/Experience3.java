package chapter14;

import java.util.HashMap;
import java.util.Map;

public class Experience3 {
    public static void main(String args[]){
        Emp emp = new Emp("015","大象");
        Map map =new HashMap();
        map.put(emp.getE_id(),emp.getE_name());
        map.remove("015");
    }

}
