### **Quick Revision: Array Operations in Java 🚀**

Here’s a list of **common array operations** in Java with code snippets for quick reference.

---

### **1. Declaration and Initialization**
```java
// Declaration
int[] arr; 

// Initialization
arr = new int[5]; // Array of size 5

// Combined declaration & initialization
int[] arr1 = {1, 2, 3, 4, 5}; // Direct initialization


### **2. Accessing Elements**
```java
System.out.println(arr1[2]); // Output: 3
```

---

### **3. Modifying Elements**
```java
arr1[1] = 10; // Modifies the second element
```

---

### **4. Traversing an Array**
```java
// Using for-loop
for (int i = 0; i < arr1.length; i++) {
    System.out.print(arr1[i] + " ");
}

// Using enhanced for-loop
for (int num : arr1) {
    System.out.print(num + " ");
}
```

---

### **5. Sorting an Array**
```java
import java.util.Arrays;
Arrays.sort(arr1); // Sorts in ascending order
```

---

### **6. Searching an Element**
```java
int index = Arrays.binarySearch(arr1, 3); // Works on sorted array
System.out.println("Index of 3: " + index);
```

---

### **7. Copying an Array**
```java
int[] copy = Arrays.copyOf(arr1, arr1.length); // Copy entire array
int[] copyRange = Arrays.copyOfRange(arr1, 1, 4); // Copy specific range
```

---

### **8. Filling an Array with a Value**
```java
Arrays.fill(arr1, 5); // Fills the array with 5
```

---

### **9. Converting an Array to String**
```java
System.out.println(Arrays.toString(arr1)); // Prints: [5, 5, 5, 5, 5]
```

---

### **10. Finding Maximum & Minimum Element**
```java
int max = Arrays.stream(arr1).max().getAsInt();
int min = Arrays.stream(arr1).min().getAsInt();
```

---

### **11. Reversing an Array**
```java
for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
    int temp = arr1[i];
    arr1[i] = arr1[j];
    arr1[j] = temp;
}
```

---

### **12. Checking if Two Arrays are Equal**
```java
boolean isEqual = Arrays.equals(arr1, copy);
System.out.println("Arrays are equal: " + isEqual);
```

---

### **13. Multi-Dimensional Arrays**
```java
int[][] matrix = new int[3][3]; // 3x3 matrix

// Traversing
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
}
```

---

### **14. Converting Array to List**
```java
import java.util.List;
import java.util.Arrays;
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
```

---

### **15. Using Streams to Process Arrays**
```java
Arrays.stream(arr1).forEach(System.out::print);
```

---

💡 **Hope this helps in quick revision! Let me know if you need more details. 🚀**
