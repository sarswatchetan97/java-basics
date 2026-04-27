//Map Interface -> key, value pairs
//HashMap - allows only 1 null values, Insertion order is not maintained
//HashTable - doesn't allow null values
//LinkedHashMap - Insertion order is maintained
//TreeMap - sorted way

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.HashMap<>();
        //Insertion
        map.put("in", "India");
//        map.put("in", "India2");
        map.put("pak", "Pakistan");
        map.put("en", "England");

        System.out.println(map);

        Map<String, String> table = new java.util.HashMap<>();
        table.put("br", "brazil");

        System.out.println("Before - " + table);
        table.putAll(map);
        System.out.println("After - " + table);

        table.remove("pak");
//        System.out.println(table);
//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());

        table.putIfAbsent("ca", "Canada");
        System.out.println(table);

        System.out.println(table.getOrDefault("nep", "none"));

        System.out.println(table.containsKey("in"));

        System.out.println(table.containsValue("United States"));

        table.replace("in", "Indonesia");
        System.out.println(table);

        table.replace("in", "Indonesia", "India");
        System.out.println(table);

        table.put("us", "United States");
        table.remove("us");
        System.out.println(table);
        table.put("us", "United States");
        System.out.println(table);

        Set<String> keySet = table.keySet();
        System.out.println(keySet);

        Collection<String> values = table.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Entry Set:- " + entrySet);

        for(Map.Entry<String, String> entry : table.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
