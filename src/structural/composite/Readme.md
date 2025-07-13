# 🌳 Composite Pattern – Organization Structure Example (Java)

This project demonstrates the **Composite Design Pattern** in Java by modeling an organization structure with departments and employees. The Composite pattern allows you to treat individual objects (employees) and compositions (departments) uniformly.

---

## 🧱 Pattern Used

**Composite Pattern** – a structural design pattern that lets you compose objects into tree structures and work with these structures as if they were individual objects.

---

## 📂 Project Structure

<pre><code>src/
    └── structural/
        └── composite/
            ├── OrganizationComponent.java
            ├── Department.java
            ├── Employee.java
            └── OrganizationStructure.java
</code></pre>

---

## 🔧 How It Works

### 1. `OrganizationComponent` (Abstract Class)
Defines the common interface for all components (departments and employees). Provides default implementations for add/remove/getChild, which are overridden by composites.

### 2. `Department` (Composite)
Represents a department that can contain employees or other departments. Implements methods to add, remove, and display child components.

### 3. `Employee` (Leaf)
Represents an individual employee. Implements the display method.

### 4. `OrganizationStructure` (Main)
Demonstrates how to build and display the organization structure.

---

## 🚀 Usage Example

```java
public class OrganizationStructure {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", "Software Engineer", "Developer");
        Employee bob = new Employee("Bob", "Software Engineer", "AI Engineer");
        Employee charlie = new Employee("Charlie", "Software Engineer", "Architect");
        Employee dave = new Employee("Dave", "Designer", "UI/UX Designer");
        Employee eve = new Employee("Eve", "HR", "Recruiter");

        Department engineering = new Department("Engineering", "Handles all software development tasks");
        Department design = new Department("Design", "Responsible for UI/UX design");
        Department hr = new Department("HR", "Manages human resources and recruitment");

        // Attempt to add a component to a leaf (will throw exception)
        try {
            alice.add(dave);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        engineering.add(alice);
        engineering.add(bob);
        engineering.add(charlie);

        design.add(dave);

        hr.add(eve);

        Department headquarters = new Department("Headquarters", "Main office of the organization");
        headquarters.add(engineering);
        headquarters.add(design);
        headquarters.add(hr);

        System.out.println("=== Engineer Structure ===");
        engineering.display(0);

        System.out.println("\n\n=== Design Structure ===");
        design.display(0);

        System.out.println("\n\n=== Company Structure ===");
        headquarters.display(0);
    }
}
```

---

## 📝 Example Output

```
Error: Cannot add to a leaf component

=== Engineer Structure ===
Department: Engineering - Handles all software development tasks
  - Alice (Developer)
  - Bob (AI Engineer)
  - Charlie (Architect)


=== Design Structure ===
Department: Design - Responsible for UI/UX design
  - Dave (UI/UX Designer)


=== Company Structure ===
Department: Headquarters - Main office of the organization
  Department: Engineering - Handles all software development tasks
    - Alice (Developer)
    - Bob (AI Engineer)
    - Charlie (Architect)
  Department: Design - Responsible for UI/UX design
    - Dave (UI/UX Designer)
  Department: HR - Manages human resources and recruitment
    - Eve (Recruiter)
```

---

## 📚 Benefits

- **Uniformity:** Treats employees and departments uniformly.
- **Extensibility:** Easy to add new types of organization components.
- **Simplicity:** Simplifies client code for complex structures.

---

## 🏗️ Extending the System

To add new types of organization components, extend `OrganizationComponent` and implement the required methods.

---

## 🏁 Conclusion

This project is a simple and extensible demonstration of the Composite pattern in Java, intended for learning purposes.

---