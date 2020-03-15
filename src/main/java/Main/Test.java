package Main;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String a  = "hello";
        int b =10;
        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"One");
        m1(a,b,map1);
        System.out.println(map1);
    }

    public static void m1(String msg,int msg2,Map map1){
        System.out.println(map1);
        map1.put(2,"Two");
        System.out.println(map1);

    }
}
