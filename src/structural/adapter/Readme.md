# 🔌 Adapter Pattern – Logger Example (Java)

This project demonstrates the **Adapter Design Pattern** in Java by unifying different logging systems (legacy, console, and file loggers) under a single interface. The Adapter pattern allows incompatible interfaces to work together by wrapping existing classes with a new interface.

---

## 🧱 Pattern Used

**Adapter Pattern** – a structural design pattern that allows objects with incompatible interfaces to collaborate by providing a wrapper (adapter) that translates one interface into another.

---

## 📂 Project Structure

<pre><code>src/
    └── structural/
        └── adapter/
            ├── AppLogger.java
            ├── AppService.java
            ├── LoggerAdapter.java
            ├── adaptees/
            │   ├── ConsoleLogger.java
            │   ├── FileLogger.java
            │   └── LegacyLogger.java
            └── Readme.md
</code></pre>

---

## 🔧 How It Works

### 1. `AppLogger` (Target Interface)
Defines a unified logging interface with methods for debug, info, warn, and error messages.

### 2. Adaptees (`LegacyLogger`, `ConsoleLogger`, `FileLogger`)
Existing logger classes with different interfaces and implementations.

### 3. `LoggerAdapter` (Adapter)
Implements `AppLogger` and internally delegates calls to the appropriate adaptee, translating method calls as needed.

### 4. `AppService` (Client)
Uses the `AppLogger` interface for logging, remaining agnostic to the underlying logger implementation.

---

## 🚀 Usage Example

```java
public class AppService {
    public static void main(String[] args) {
        AppLogger legacy = LoggerAdapter.legacyLogger();
        new AppService(legacy).run();

        AppLogger console = LoggerAdapter.consoleLogger();
        new AppService(console).run();

        AppLogger file = LoggerAdapter.fileLogger("app.log");
        new AppService(file).run();
    }
}
```

---

## 📝 Example Output

```
Legacy log: Service is starting...
Legacy error: An error occurred in the service
java.lang.ArithmeticException: / by zero
	at structural.adapter.AppService.run(AppService.java:13)
	at structural.adapter.AppService.main(AppService.java:22)
[Console DEBUG]: Service is starting...
[Console ERROR]: An error occurred in the service
java.lang.ArithmeticException: / by zero
	at structural.adapter.AppService.run(AppService.java:13)
	at structural.adapter.AppService.main(AppService.java:24)

```

---

## 📚 Benefits

- **Reusability:** Integrates existing loggers without modifying their code.
- **Flexibility:** Easily switch or add new logging systems.
- **Decoupling:** Client code depends only on the target interface, not on specific logger implementations.

---

## 🏗️ Extending the System

To add a new logger, implement an adaptee class and update `LoggerAdapter` to support it.

---

## 🏁 Conclusion

This project provides a clear and practical demonstration of the Adapter pattern in Java, making it easy to unify and extend logging functionality.

---