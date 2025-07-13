package creational.factory.documentexample.factory;

import creational.factory.documentexample.document.Document;
import creational.factory.documentexample.document.PDFDocument;

public class PDFDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String type) {
        return new PDFDocument();
    }
}
