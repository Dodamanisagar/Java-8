package Order_6.ForEachLoopInJava8;

import java.util.HashMap;
import java.util.Map;

public class ForEachWithMap {
    public static void main(String[] args) {
        Map<Integer, String> mapOfWords = new HashMap<Integer, String>();
        mapOfWords.put(1, "Hi");
        mapOfWords.put(8, "Hello");
        mapOfWords.put(5, "Hye");
        mapOfWords.put(2, "Bye");

        //keySet() is used to get key values from the map
        mapOfWords.keySet().forEach(keys->{
            System.out.println("key from map "+keys);
        });

        //values() used to get values from the map
        System.out.println();
        mapOfWords.values().forEach(values->{
            System.out.println("Value from map "+values);
        });


        //entrySet() used to get key and values from the map
        System.out.println();
        mapOfWords.entrySet().forEach(values->{
            System.out.println("key and Value from map "+values);
        });
    }
}
