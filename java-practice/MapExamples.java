import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // 1. put()
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        System.out.println("Map after put: " + map);

        // 2. get()
        System.out.println("Get key 2: " + map.get(2)); // Bob

        // 3. remove()
        map.remove(3);
        System.out.println("After remove: " + map);

        // 4. containsKey()
        System.out.println("Contains key 1? " + map.containsKey(1));

        // 5. containsValue()
        System.out.println("Contains value 'Bob'? " + map.containsValue("Bob"));

        // 6. size()
        System.out.println("Size: " + map.size());

        // 7. isEmpty()
        System.out.println("Is empty? " + map.isEmpty());

        // 8. keySet()
        System.out.println("Keys: " + map.keySet());

        // 9. values()
        System.out.println("Values: " + map.values());

        // 10. entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // 11. putIfAbsent()
        map.putIfAbsent(2, "David"); // won't overwrite Bob
        map.putIfAbsent(4, "Eve");
        System.out.println("After putIfAbsent: " + map);

        // 12. replace()
        map.replace(1, "Alex");
        System.out.println("After replace: " + map);

        // 13. replace(key, oldVal, newVal)
        boolean replaced = map.replace(2, "Bob", "Bobby");
        System.out.println("Replaced Bob? " + replaced + " -> " + map);

        // 14. getOrDefault()
        System.out.println("Get key 10 or default: " + map.getOrDefault(10, "Not Found"));

        // 15. forEach()
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        // 16. compute()
        map.compute(1, (k, v) -> v + " Jr.");
        System.out.println("After compute: " + map);

        // 17. computeIfAbsent()
        map.computeIfAbsent(5, k -> "Frank");
        System.out.println("After computeIfAbsent: " + map);

        // 18. computeIfPresent()
        map.computeIfPresent(2, (k, v) -> v.toUpperCase());
        System.out.println("After computeIfPresent: " + map);

        // 19. merge()
        map.merge(4, " Adams", (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge: " + map);

        // 20. clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}