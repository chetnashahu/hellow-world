package test.Leetcode;

import java.util.HashMap;
import java.util.Map;
import test.Leetcode.MapSorting;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        //Map<String, Integer> hm1 = sortByValue(hm);

        // print the sorted hashmap
//        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
//            System.out.println("Key = " + en.getKey() +
//                    ", Value = " + en.getValue());
//        }
    }
}
