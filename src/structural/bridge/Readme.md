# 🌉 Bridge Pattern – Shape and Color Example (Java)

This module demonstrates the **Bridge Design Pattern** in Java by decoupling the abstraction (`Shape`) from its implementation (`Color`). The Bridge pattern allows both abstractions and implementations to vary independently.

---

## 🧱 Pattern Used

**Bridge Pattern** – a structural design pattern that separates an abstraction from its implementation, enabling them to evolve independently.

---

## 📂 Project Structure

<pre><code>src/
  └── structural/
      └── bridge/
          ├── Blue.java
          ├── Circle.java
          ├── Color.java
          ├── Main.java
          ├── Red.java
          ├── Shape.java
          └── Square.java
</code></pre>

---

## 🔧 How It Works

1. **Abstraction (`Shape`)**  
   Abstract class that contains a reference to a `Color` and defines the `draw()` method.

2. **Refined Abstractions (`Circle`, `Square`)**  
   Concrete shapes that implement the `draw()` method and use the `Color` interface.

3. **Implementor (`Color`)**  
   Interface for color implementations.

4. **Concrete Implementors (`Red`, `Blue`)**  
   Provide specific color behavior.

---

## 🚀 Usage Example

```java
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        redCircle.draw();
        Shape blueSquare = new Square(new Blue());
        blueSquare.draw();
    }
}
```

---

## 📝 Example Output

```
Drawing Circle with color: Applying red color.
Drawing Square with color: Applying blue color.
```

---

## 📚 Benefits

- **Decouples abstraction and implementation:** Both can be extended independently.
- **Flexibility:** Easily add new shapes or colors without modifying existing code.
- **Reduces code duplication:** Avoids combinatorial explosion of subclasses.

---

## 🏗️ Extending the System

To add a new shape or color, simply create a new class implementing `Shape` or `Color`.

---

## 🏁 Conclusion

This project provides a clear demonstration of the Bridge pattern in Java, making it easy to combine different shapes and colors flexibly.

---