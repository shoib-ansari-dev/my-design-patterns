package creational.factory.documentexample;

public class ExcelDocument implements Document{
    private String content;
    @Override
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public void export(String fileName) {
        System.out.println("Exporting Excel document with content: " + content);
        System.out.println("Excel name: " + fileName + ".xlsx");
    }

}
