package creational.factory.documentexample.factory;

import creational.factory.documentexample.document.Document;
import creational.factory.documentexample.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String type) {
        return new WordDocument();
    }
}
