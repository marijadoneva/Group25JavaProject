package Hannah;


import java.util.*;

public class SortMapByValues {
        public static Map<String, Integer> sortMapByValuesAscending(Map<String, Integer> unsortedMap) {
            List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());

            // Using the Collections.sort() method with a custom comparator
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            return sortedMap;
        }

        public static void main(String[] args) {
            Map<String, Integer> unsortedMap = new HashMap<>();
            unsortedMap.put("Apple", 5);
            unsortedMap.put("Banana", 2);
            unsortedMap.put("Cherry", 9);
            unsortedMap.put("Date", 1);
            unsortedMap.put("Fig", 5);

            System.out.println("Unsorted map: " + unsortedMap);

            Map<String, Integer> sortedMap = sortMapByValuesAscending(unsortedMap);

            System.out.println("Sorted map by values (ascending): " + sortedMap);
        }
    }

