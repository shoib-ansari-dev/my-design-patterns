package creational.prototype;

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
