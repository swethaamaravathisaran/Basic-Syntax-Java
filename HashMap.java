Here’s a concise revision-friendly note on **HashMap operations in Java**:  

---

# **HashMap Operations in Java**  

### **1. Create a HashMap**
```java
HashMap<KeyType, ValueType> map = new HashMap<>();
```
Example:  
```java
HashMap<Integer, String> map = new HashMap<>();
```

---

### **2. Add Key-Value Pairs (put)**
```java
map.put(key, value);
```
Example:  
```java
map.put(1, "Apple");
map.put(2, "Banana");
```
🔹 If the key already exists, the value is updated.

---

### **3. Get Value by Key (get)**
```java
map.get(key);
```
Example:  
```java
System.out.println(map.get(1)); // Output: Apple
```
🔹 Returns `null` if the key is not found.

---

### **4. Check if Key Exists (containsKey)**
```java
map.containsKey(key);
```
Example:  
```java
System.out.println(map.containsKey(2)); // Output: true
```

---

### **5. Check if Value Exists (containsValue)**
```java
map.containsValue(value);
```
Example:  
```java
System.out.println(map.containsValue("Apple")); // Output: true
```

---

### **6. Remove a Key-Value Pair (remove)**
```java
map.remove(key);
```
Example:  
```java
map.remove(2); // Removes key 2 from the map
```
🔹 Can also remove by checking value:  
```java
map.remove(key, value); // Removes if key-value pair matches
```

---

### **7. Get Size of HashMap**
```java
map.size();
```
Example:  
```java
System.out.println(map.size()); // Output: 1
```

---

### **8. Check if HashMap is Empty**
```java
map.isEmpty();
```
Example:  
```java
System.out.println(map.isEmpty()); // Output: false
```

---

### **9. Iterate Over HashMap**
#### 🔹 Using `forEach` (Java 8+)
```java
map.forEach((key, value) -> System.out.println(key + " -> " + value));
```

#### 🔹 Using `entrySet()`
```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

#### 🔹 Using `keySet()`
```java
for (Integer key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

#### 🔹 Using `values()`
```java
for (String value : map.values()) {
    System.out.println(value);
}
```

---

### **10. Replace a Value**
```java
map.replace(key, newValue);
```
Example:  
```java
map.replace(1, "Mango");
```
🔹 Can also replace conditionally:  
```java
map.replace(key, oldValue, newValue);
```

---

### **11. Get All Keys (keySet)**
```java
map.keySet();
```
Example:  
```java
System.out.println(map.keySet()); // Output: [1, 2, 3]
```

---

### **12. Get All Values (values)**
```java
map.values();
```
Example:  
```java
System.out.println(map.values()); // Output: [Apple, Banana, Mango]
```

---

### **13. Get All Key-Value Pairs (entrySet)**
```java
map.entrySet();
```
Example:  
```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

### **14. Clear the HashMap**
```java
map.clear();
```
🔹 Removes all key-value pairs.

---

### **15. Get Default Value if Key Not Found**
```java
map.getOrDefault(key, defaultValue);
```
Example:  
```java
System.out.println(map.getOrDefault(5, "Not Found")); // Output: Not Found
```

---

### **16. Merge Values**
```java
map.merge(key, newValue, (oldValue, newValue) -> oldValue + newValue);
```
Example:  
```java
map.put(1, "Hello");
map.merge(1, " World", (oldV, newV) -> oldV + newV); // "Hello World"
```

---

### **17. Compute a Value**
```java
map.compute(key, (k, v) -> newValue);
```
Example:  
```java
map.compute(1, (k, v) -> v.toUpperCase());
```
🔹 If the key doesn’t exist, `v` will be `null`.

---

### **18. Compute If Absent**
```java
map.computeIfAbsent(key, k -> newValue);
```
Example:  
```java
map.computeIfAbsent(3, k -> "Grapes"); // Adds key 3 if not present
```

---

### **19. Compute If Present**
```java
map.computeIfPresent(key, (k, v) -> newValue);
```
Example:  
```java
map.computeIfPresent(1, (k, v) -> v + "!!!"); // Modifies existing value
```

---

# **Summary Table**
| Operation | Method |
|-----------|--------|
| Create | `new HashMap<>()` |
| Add | `put(key, value)` |
| Get | `get(key)` |
| Check Key Exists | `containsKey(key)` |
| Check Value Exists | `containsValue(value)` |
| Remove | `remove(key)` |
| Size | `size()` |
| Check Empty | `isEmpty()` |
| Iterate | `forEach`, `entrySet()`, `keySet()`, `values()` |
| Replace | `replace(key, newValue)` |
| Get Keys | `keySet()` |
| Get Values | `values()` |
| Get Key-Value Pairs | `entrySet()` |
| Clear | `clear()` |
| Get Default | `getOrDefault(key, defaultValue)` |
| Merge | `merge(key, newValue, BiFunction)` |
| Compute | `compute(key, BiFunction)` |
| Compute If Absent | `computeIfAbsent(key, Function)` |
| Compute If Present | `computeIfPresent(key, BiFunction)` |

---

This should help you revise quickly! 🚀 Let me know if you need any clarifications. 😊
