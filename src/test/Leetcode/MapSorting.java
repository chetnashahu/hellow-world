package test.Leetcode;

import java.util.*;


public class MapSorting {

    public static void main(String[] args) {
        // write your code here

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Data Structure", 85);
        hm.put("Data Structure", 85);
        hm.put("Data Structure", 82);
        hm.put("Data Structure", 81);
        hm.put("Data Structure", 83);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByKey(hm);

        int[] nums = {1,1,2,2,2,3,7,8,9};
        HashMap<Integer, Integer> hmn = new HashMap<Integer, Integer>();
        for(int n :nums)
        {
            hmn.put(n,hmn.getOrDefault(n,0)+1);
        }
        System.out.println("hmn"+hmn);
        heapMinMax(hmn);
        // [1,1,2,2,2,3]
    }
    public static Map<String,Integer> sortByValue(Map<String, Integer> map)
    {
        List<Map.Entry<String,Integer>> list  = new LinkedList<>(map.entrySet());

        Collections.sort(list,
                new Comparator<Map.Entry<String,Integer>>(){
                    public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2)
                    {
                        return (o1.getValue()).compareTo(o2.getValue());
                    }
                }
        );
        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
        return map;
    }

    public static Map<String,Integer> sortByKey(Map<String,Integer> map)
    {
        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());

        list.sort((Map.Entry<String, Integer> o1,
                   Map.Entry<String, Integer> o2) -> (o1.getValue().compareTo(o2.getValue()))) ;

//        Collections.sort(list,
//            new Comparator<Map.Entry<String,Integer>>(){
//              public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
//                  return o1.getKey().compareTo(o2.getKey());
//              }
//            }
//        );
        System.out.println("SortbyKey"+list);
        return map;
    }

    public static void heapMinMax(Map<Integer,Integer> map)
    {
        int[] nums = {2,4,5,6,75,3,-56,3,6,45};
        PriorityQueue<Integer> frePq =  new PriorityQueue<>((a1,a2)->map.get(a1)!=map.get(a2) ? map.get(a1)-map.get(a2): a2-a1);
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a1, a2)-> a2 - a1);
//        for(Map.Entry<String,Integer> m : map.entrySet())
//        {
//
//        }
       map.forEach((k,v) -> {
           frePq.offer(k);
       });
        System.out.println("frePq:"+frePq);
       for(int n : nums)
       {
           maxHeap.add(n);
       }
        System.out.println("Max heap:"+maxHeap);
    }
}
