# 🏭 Abstract Factory Pattern – Cross-Platform GUI Example (Java)

This project demonstrates the **Abstract Factory Design Pattern** in Java by modeling a cross-platform GUI toolkit. The system can create families of related UI components (Button, Dropdown, CheckBox) for different operating systems (Windows, MacOS, Linux) and themes (Light, Dark).

---

## 🧱 Pattern Used

**Abstract Factory Pattern** – a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## 📂 Project Structure

<pre><code>src/
  └── creational/
      └── abstractfactory/
          ├── client/
          │   └── Application.java
          ├── component/
          │   ├── Buttons.java
          │   ├── CheckBox.java
          │   ├── Dropdown.java
          │   └── Theme.java
          ├── factory/
          │   ├── GUIFactory.java
          │   ├── LinuxFactory.java
          │   ├── MacOSFactory.java
          │   └── WindowsFactory.java
          ├── linux/
          │   ├── LinuxButton.java
          │   ├── LinuxCheckBox.java
          │   └── LinuxDropdown.java
          ├── macos/
          │   ├── MacOSButton.java
          │   ├── MacOSCheckBox.java
          │   └── MacOSDropdown.java
          ├── windows/
          │   ├── WindowsButton.java
          │   ├── WindowsCheckBox.java
          │   └── WindowsDropdown.java
          └── provider/
              └── FactoryProvider.java
</code></pre>

---

## 🔧 How It Works

1. **Component Interfaces**:
    - `Buttons`, `Dropdown`, `CheckBox` define the contract for UI components.
    - `Theme` enum specifies available themes.

2. **Concrete Components**:
    - Each OS (Windows, MacOS, Linux) has its own implementation of each component, supporting theming.

3. **Abstract Factory (`GUIFactory`)**:
    - Declares methods to create each component type.

4. **Concrete Factories**:
    - `WindowsFactory`, `MacOSFactory`, `LinuxFactory` create OS-specific components.

5. **Factory Provider**:
    - `FactoryProvider` selects the correct factory based on the current OS.

6. **Client (`Application`)**:
    - Uses the factory to create and use components without knowing their concrete classes.

---

## 🚀 Usage Example

```java
public class Application {
    public static void main(String[] args) {
        Theme theme = Theme.LIGHT;
        GUIFactory factory = new MacOSFactory(); // For demonstration, I used MacOS
        Application app = new Application(factory, theme);
        app.run();
    }
    // ... rest of Application class ...
}
```

---

## 📝 Example Output

```
Rendering MacOS button with them: LIGHT
MacOS Button clicked
Rendering MacOS Dropdown button with theme LIGHT
Selecting MacOS DropDown
Rendering MacOS button with theme LIGHT
Toggling MacOS CheckBox
```

---

## 📚 Benefits

- **Cross-platform:** Easily switch between OS-specific component families.
- **Consistency:** Ensures UI components are compatible within a family.
- **Extensible:** Add new OS or themes by implementing new factories/components.

---

## 🏗️ Extending the System

To add a new OS or theme:
1. Implement the component interfaces for the new OS/theme.
2. Create a new factory class.
3. Update `FactoryProvider` if needed.

---

## 🏁 Conclusion

This project is a simple and extensible demonstration of the Abstract Factory pattern in Java, intended for learning purposes.

---