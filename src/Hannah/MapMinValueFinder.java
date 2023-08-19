package Hannah;
import java.util.*;
public class MapMinValueFinder {


        public static <K, V extends Comparable<V>> V findMinValue(Map<K, V> map) {
            if (map.isEmpty()) {
                throw new IllegalArgumentException("Map is empty.");
            }

            V minValue = null;
            for (V value : map.values()) {
                if (minValue == null || value.compareTo(minValue) < 0) {
                    minValue = value;
                }
            }

            return minValue;
        }

        public static void main(String[] args) {
            Map<String, Integer> sampleMap = new HashMap<>();
            sampleMap.put("A", 5);
            sampleMap.put("B", 2);
            sampleMap.put("C", 8);
            sampleMap.put("D", 1);

            Integer minValue = findMinValue(sampleMap);
            System.out.println("The minimum value is: " + minValue);
        }
    }

