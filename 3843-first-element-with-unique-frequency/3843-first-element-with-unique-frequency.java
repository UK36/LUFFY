import java.util.*;

class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int freq : freqMap.values()) {
            countMap.put(freq, countMap.getOrDefault(freq, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (countMap.get(entry.getValue()) == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}