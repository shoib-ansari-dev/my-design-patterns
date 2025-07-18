# 🦸‍♂️ Singleton Pattern – Java Implementations

This module demonstrates several ways to implement the **Singleton Design Pattern** in Java. The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

---

## 🧱 Pattern Used

**Singleton Pattern** – a creational design pattern that restricts the instantiation of a class to one object and provides a single point of access.

---

## 📂 Project Structure

<pre><code>src/
  └── creational/
      └── singleton/
          ├── billpugh/
          │   └── BillPughSingleton.java
          ├── eager/
          │   ├── EagerMain.java
          │   └── EagerSingleton.java
          └── lazy/
              ├── LazyFailingAndThreadSafe.java
              ├── LazySingleton.java
              └── LazyThreadSafe.java
</code></pre>

---

## 🔧 Implementations

1. **Eager Initialization**  
   Instance is created at class loading time.

2. **Lazy Initialization**  
   Instance is created when requested, with and without thread safety.

3. **Bill Pugh Singleton**  
   Uses a static inner helper class for thread-safe, lazy initialization.

---

## 🚀 Usage Example (Bill Pugh Singleton)

```java
public class BillPughSingleton {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh Singleton Instance: " + billPughSingleton);
        BillPughSingleton anotherBillPughSingleton = BillPughSingleton.getInstance();
        System.out.println("Another Bill Pugh Singleton Instance: " + anotherBillPughSingleton);
    }
}
```

---

## 📝 Example Output

```
BillPughSingleton instance created.
Bill Pugh Singleton Instance: creational.singleton.billpugh.BillPughSingleton@3feba861
Another Bill Pugh Singleton Instance: creational.singleton.billpugh.BillPughSingleton@3feba861
```

---

## 📚 Benefits

- **Single Instance:** Guarantees only one instance exists.
- **Global Access:** Provides a global point of access.
- **Thread Safety:** Bill Pugh and thread-safe lazy implementations are safe for concurrent use.

---

## 🏗️ Extending the System

To add new singleton types, create a new class following one of the demonstrated patterns.

---

## 🏁 Conclusion

This module provides multiple approaches to implementing the Singleton pattern in Java, covering eager, lazy, and Bill Pugh methods.

---