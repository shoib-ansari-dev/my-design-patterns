package creational.factory.documentexample.factory;

import creational.factory.documentexample.document.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument(String type);
}
