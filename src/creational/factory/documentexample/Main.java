package creational.factory.documentexample;

import creational.factory.documentexample.document.Document;
import creational.factory.documentexample.factory.DocumentFactory;
import creational.factory.documentexample.factory.ExcelDocumentFactory;
import creational.factory.documentexample.factory.PDFDocumentFactory;
import creational.factory.documentexample.factory.WordDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument("PDF");
        pdfDocument.setContent("This is a PDF document.");
        pdfDocument.export("document.pdf");

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument("Word");
        wordDocument.setContent("This is a Word document.");
        wordDocument.export("document.docx");

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument("Excel");
        excelDocument.setContent("This is an Excel document.");
        excelDocument.export("document.xlsx");
    }
}
