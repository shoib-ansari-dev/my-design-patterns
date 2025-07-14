package structural.adapter.adaptees;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger {
    private final String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }
    public void writeLog(String level, String message) {
        try{
            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
            writer.println("[" + level + "]: " + message);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public void writeError(String message, Throwable throwable) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
            writer.println("[ERROR] : " + message);
            throwable.printStackTrace(writer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
