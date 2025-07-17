package creational.prototype;


import javax.print.Doc;

public class Document  implements Prototype<Document>{
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public Document(Document other){
        this.title = other.title;
        this.content = other.content;
    }
    public void print() {
        System.out.println("Document Title: " + title);
        System.out.println("Content: " + content);
    }
    @Override
    public Document clone() {
        return new Document(this.title, this.content);
    }
}
