package creational.factory.documentexample.document;

public class PDFDocument implements Document{
    private String content;
    @Override
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public void export(String fileName) {
        System.out.println("Exporting PDF document with content: " + content);
        System.out.println("PDF name: " + fileName + ".pdf");
    }
}
