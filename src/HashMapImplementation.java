import java.util.*;
import java.util.Map.Entry;

public class HashMapImplementation {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        Map<String, Integer> newHM = new HashMap<>();
        Random rand = new Random();
        int randToFind = rand.nextInt(8999) + 1000; //Sets a random int to find
        hm.put("1", 1);
        hm.put("3", 3);
        hm.put("5", 5);
        hm.put("7", 7);
        hm.put("9", 9);
        hm.put("11", 11);
        System.out.println(hm);
        hm = addAndSort(hm, 8);
        System.out.println(hm);
        System.out.println("\n-----New HashMap operation starts here-----\n");
        System.out.println(newHM);
        for(int i=0;i<500;i++){
            int nextRand = rand.nextInt(8999) + 1000;
            newHM.put(Integer.toString(nextRand),nextRand);
        }
        System.out.println(newHM);
        System.out.format("Integer to find is: %d\n", randToFind);
        System.out.format("Index of the integer is: %d\n", findValue(newHM, randToFind));
    }
    public static Map<String, Integer> addAndSort(Map<String, Integer> hashmap, int value){
        hashmap.put(Integer.toString(value), value);
        return sortByValue(hashmap);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static int findValue(Map<String, Integer> hashmap, int value){
        try{
            return hashmap.get(Integer.toString(value));
        }
        catch(NullPointerException e){
            return -1;
        }
    }

}
