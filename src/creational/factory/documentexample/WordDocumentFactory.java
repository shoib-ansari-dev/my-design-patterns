package creational.factory.documentexample;

public class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String type) {
        return new WordDocument();
    }
}
