# 🏗️ Builder Pattern – Computer Configuration Example (Java)

This project demonstrates the **Builder Design Pattern** in Java by modeling the construction of complex `Computer` objects with various configurations. The Builder pattern allows step-by-step creation of objects with many optional parameters, improving readability and flexibility.

---

## 🧱 Pattern Used

**Builder Pattern** – a creational design pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

---

## 📂 Project Structure

<pre><code>src/
  └── creational/
      └── builder/
          ├── Computer.java
          └── BuilderPatternExample.java
</code></pre>

---

## 🔧 How It Works

1. **Product (`Computer`)**:
    - Represents a computer with various attributes (CPU, RAM, storage, GPU, OS, graphic card).
    - Has a static inner `ComputerBuilder` class for step-by-step construction.

2. **Builder (`ComputerBuilder`)**:
    - Provides setter methods for each attribute, returning the builder for method chaining.
    - The `build()` method creates the final `Computer` object.

3. **Client (`BuilderPatternExample`)**:
    - Uses the builder to create different computer configurations in a readable way.

---

## 🚀 Usage Example

```java
public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setOS("Windows 11")
                .setGraphicCard("NVIDIA GeForce RTX 3080")
                .build();

        System.out.println("Gaming PC us" + gamingPC);

        Computer officePC = new Computer.ComputerBuilder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("Integrated Graphics")
                .setOS("Windows 10")
                .build();

        System.out.println("Office PC is " + officePC);
    }
}
```

---

## 📝 Example Output

```
Gaming PC uscreational.builder.Computer@5b480cf9
Office PC is creational.builder.Computer@10f87f48
```

---

## 📚 Benefits

- **Readability:** Clear and fluent object construction.
- **Immutability:** Final product can be made immutable.
- **Flexibility:** Easily create objects with different configurations.
- **Maintainability:** Avoids telescoping constructors.

---

## 🏗️ Extending the System

To add new attributes, update the `Computer` and `ComputerBuilder` classes with new fields and setter methods.

---

## 🏁 Conclusion

This project provides a simple and extensible demonstration of the Builder pattern in Java, making it easy to construct complex objects step by step.

---