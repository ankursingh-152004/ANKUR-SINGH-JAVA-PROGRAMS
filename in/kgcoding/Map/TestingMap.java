package in.kgcoding.Map;//stores key-vlaue pair and each key is mapped to its value and key should be unique.

import java.util.HashMap;

public class TestingMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Ankur", 100);
        map.put("Ram", 101);
        map.put("Shyam", 200);
        map.put("rohan", 400);
        map.put("jay", 00);
        map.put("Rahul", 10); 
        System.out.println(map.size());
        System.out.println(map.get("Ankur"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Vijay"));
        System.out.println(map.remove("jay"));//00 as output because its value is 00.

        for (String key : map.keySet()) {
            System.out.printf("%s : %s \n",key,map.get(key));
        }
    }

}
