---

# 🧬 Prototype Pattern – Document Example (Java)

This project demonstrates the **Prototype Design Pattern** in Java by modeling the cloning of `Document` objects. The Prototype pattern enables object creation by copying existing instances, making it easy to duplicate complex objects.

---

## 🧱 Pattern Used

**Prototype Pattern** – a creational design pattern that allows creating new objects by copying a prototype instance, rather than instantiating new ones from scratch.

---

## 📂 Project Structure

<pre><code>src/
  └── creational/
      └── prototype/
          ├── Document.java
          ├── Prototype.java
          └── Main.java
</code></pre>

---

## 🔧 How It Works

1. **Prototype Interface (`Prototype<T>`)**  
   Defines a `clone()` method for copying objects.

2. **Concrete Prototype (`Document`)**  
   Implements the `Prototype` interface and provides a copy constructor and a `clone()` method.

3. **Client (`Main`)**  
   Demonstrates cloning and printing `Document` objects.

---

## 🚀 Usage Example

```java
public class Main {
    public static void main(String[] args) {
        Document originalDocument = new Document("My Document", "This is the content of the document.");
        originalDocument.print();
        Document clonedDocument = originalDocument.clone();
        clonedDocument.print();
        Document deepClonedDocument = new Document(originalDocument);
        deepClonedDocument.print();
    }
}
```

---

## 📝 Example Output

```
Document Title: My Document
Content: This is the content of the document.
Document Title: My Document
Content: This is the content of the document.
Document Title: My Document
Content: This is the content of the document.
```

---

## 📚 Benefits

- **Efficient Cloning:** Quickly duplicate objects without rebuilding from scratch.
- **Decoupling:** Client code does not depend on concrete classes for object creation.
- **Flexibility:** Easily extend to support deep or shallow copies.

---

## 🏗️ Extending the System

To support more complex objects, implement custom copy logic in the prototype’s `clone()` method or copy constructor.

---

## 🏁 Conclusion

This project provides a clear demonstration of the Prototype pattern in Java, making it easy to clone and manage document objects.

---