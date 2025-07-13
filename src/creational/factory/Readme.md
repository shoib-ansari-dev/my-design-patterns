# 📄 Document Generator System – Factory Method Pattern (Java)

This project demonstrates the **Factory Method Design Pattern** using a real-world example of a **Document Generator System**. The system can generate documents in different formats: **PDF**, **Word**, and **Excel**, each with its own export logic.

---

## 🧱 Pattern Used

**Factory Method Pattern** – a creational design pattern that defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.

---

## 📂 Project Structure
<pre><code>src/
    ├── document/
    │   ├── Document.java
    │   ├── PDFDocument.java
    │   ├── WordDocument.java
    │   └── ExcelDocument.java
    ├── factory/
    │   ├── DocumentFactory.java
    │   ├── PDFDocumentFactory.java
    │   ├── WordDocumentFactory.java
    │   └── ExcelDocumentFactory.java
    └── Main.java
</code></pre>

---

## 🔧 How It Works

### 1. `Document` Interface
Defines a contract for setting content and exporting the document.

```java
public interface Document {
    void setContent(String content);
    void export(String filePath);
}
```

### 2. Concrete Document Classes
Each document type implements the `Document` interface and provides its own export logic.

- `PDFDocument`
- `WordDocument`
- `ExcelDocument`

### 3. Factory Classes
Abstract factory `DocumentFactory` defines a method for creating documents. Each concrete factory creates a specific document type.

- `PDFDocumentFactory`
- `WordDocumentFactory`
- `ExcelDocumentFactory`

### 4. Main Class
Demonstrates usage by creating documents using different factories.

---

## 🚀 Usage Example

```java
public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;

        // Create PDF Document
        factory = new PDFDocumentFactory();
        Document pdf = factory.createDocument();
        pdf.setContent("PDF Content");
        pdf.export("output.pdf");

        // Create Word Document
        factory = new WordDocumentFactory();
        Document word = factory.createDocument();
        word.setContent("Word Content");
        word.export("output.docx");

        // Create Excel Document
        factory = new ExcelDocumentFactory();
        Document excel = factory.createDocument();
        excel.setContent("Excel Content");
        excel.export("output.xlsx");
    }
}
```

---

## 📝 Example Output

```
Exporting PDF document to output.pdf with content: PDF Content
Exporting Word document to output.docx with content: Word Content
Exporting Excel document to output.xlsx with content: Excel Content
```

---

## 📚 Benefits

- **Extensible:** Easily add new document types by creating new factories and document classes.
- **Decoupled:** Client code depends only on the abstract `Document` interface and factory, not concrete implementations.
- **Single Responsibility:** Each class has a clear responsibility.

---

## 🏗️ Extending the System

To add a new document type (e.g., `TextDocument`):

1. Implement the `Document` interface.
2. Create a `TextDocumentFactory` extending `DocumentFactory`.
3. Use the new factory in the client code.

---

## 🏁 Conclusion

This project is a simple and extensible demonstration of the Factory Method pattern in Java, applied to a document generation scenario.
It is intended for learning purposes.