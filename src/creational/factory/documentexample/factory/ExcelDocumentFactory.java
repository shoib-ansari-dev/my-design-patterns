package creational.factory.documentexample.factory;

import creational.factory.documentexample.document.Document;
import creational.factory.documentexample.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String type) {
        return new ExcelDocument();
    }
}
