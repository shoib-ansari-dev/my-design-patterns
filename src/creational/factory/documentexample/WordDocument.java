package creational.factory.documentexample;

public class WordDocument implements Document{
    private String content;

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void export(String fileName) {
        System.out.println("Exporting Word document with content: " + content);
        System.out.println("Word name: " + fileName + ".docx");
    }
}
