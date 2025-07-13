package creational.factory.documentexample;

public abstract class DocumentFactory {
    public abstract Document createDocument(String type);

    public Document getDocument(String type, String fileName) {
        Document document = createDocument(type);
        document.setContent("Sample content for " + type + " document");
        return document;
    }
}
