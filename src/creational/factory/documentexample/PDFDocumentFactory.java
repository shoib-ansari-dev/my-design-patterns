package creational.factory.documentexample;

public class PDFDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String type) {
        return new PDFDocument();
    }
}
