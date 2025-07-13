package creational.factory.documentexample;

public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String type) {
        return new ExcelDocument();
    }
}
