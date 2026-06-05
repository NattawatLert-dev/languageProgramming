
import java.util.HashMap;

public class A34hashmaps {
    public static void main(String[] args) {
        
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("coconut", 0.25);

        map.remove("apple");

        System.out.println(map);
        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("orange"));
        System.out.println(map.containsValue(0.50));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
