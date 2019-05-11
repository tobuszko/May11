package pl.wszib.edu.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tomek", "567 234 367");
        map.put("Alicja", "222 555 111");
        map.put("Tomek", "998 876 454");
        map.put("Michał", "123 409 678");

        System.out.println(map);


        Set<String> keys = map.keySet();

        System.out.println(keys);
        System.out.println(map.containsKey("Tomek"));
        System.out.println(map.containsValue("998"));


        for (String key : keys){
            System.out.println("Imię: " + key + ", telefon: " + map.get(key));

        }

        //listowanie za pomocą values
        for (String value : map.values()){
            System.out.println("Telefon: " + value);
        }

        System.out.println();
        System.out.println();

        // listowanie za pomocą entry
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");
        }

        System.out.println(map);


    }
}
