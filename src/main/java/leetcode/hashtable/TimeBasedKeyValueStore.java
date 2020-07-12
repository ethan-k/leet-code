package leetcode.hashtable;
import java.util.*;

class TimeBasedKeyValueStore {
   Map<String, TreeMap<Integer, String>> map;
    
    public TimeMap() {
      this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)) {
            map.get(key).put(timestamp, value);
        } else{
            TreeMap<Integer, String> tmp = new TreeMap<>();
            tmp.put(timestamp, value);
            map.put(key, tmp);
        }
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";        
        if (map.get(key).floorKey(timestamp) == null)
            return ""; 
        return map.get(key).floorEntry(timestamp).getValue();
    }
}