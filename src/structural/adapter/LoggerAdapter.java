package structural.adapter;

import structural.adapter.adaptees.ConsoleLogger;
import structural.adapter.adaptees.FileLogger;
import structural.adapter.adaptees.LegacyLogger;

public class LoggerAdapter implements AppLogger{
    private final Object adaptee;

    public enum LoggerType { LEGACY, CONSOLE, FILE }

    private final LoggerType loggerType;

    public LoggerAdapter(Object adaptee, LoggerType loggerType) {
        this.adaptee = adaptee;
        this.loggerType = loggerType;
    }

    public static AppLogger legacyLogger() {
        return new LoggerAdapter(new LegacyLogger(), LoggerType.LEGACY);
    }

    public static AppLogger consoleLogger() {
        return new LoggerAdapter(new ConsoleLogger(), LoggerType.CONSOLE);
    }

    public static AppLogger fileLogger(String fileName) {
        return new LoggerAdapter(new FileLogger(fileName), LoggerType.FILE);
    }

    @Override
    public void debug(String message) {
        switch (loggerType) {
            case LEGACY:
                ((structural.adapter.adaptees.LegacyLogger) adaptee).logLogger(message);
                break;
            case CONSOLE:
                ((structural.adapter.adaptees.ConsoleLogger) adaptee).print("DEBUG", message);
                break;
            case FILE:
                ((structural.adapter.adaptees.FileLogger) adaptee).writeLog("DEBUG", message);
                break;
        }
    }

    @Override
    public void infor(String message) {
        switch (loggerType) {
            case LEGACY:
                ((structural.adapter.adaptees.LegacyLogger) adaptee).logInfo(message);
                break;
            case CONSOLE:
                ((structural.adapter.adaptees.ConsoleLogger) adaptee).print("INFO", message);
                break;
            case FILE:
                ((structural.adapter.adaptees.FileLogger) adaptee).writeLog("INFO", message);
                break;
        }
    }

    @Override
    public void warn(String message) {
        switch (loggerType) {
            case LEGACY:
                ((structural.adapter.adaptees.LegacyLogger) adaptee).logWarning(message);
                break;
            case CONSOLE:
                ((structural.adapter.adaptees.ConsoleLogger) adaptee).print("WARN", message);
                break;
            case FILE:
                ((structural.adapter.adaptees.FileLogger) adaptee).writeLog("WARN", message);
                break;
        }

    }

    @Override
    public void error(String message, Throwable throwable) {
        switch (loggerType) {
            case LEGACY:
                ((structural.adapter.adaptees.LegacyLogger) adaptee).logError(message, throwable);
                break;
            case CONSOLE:
                ((structural.adapter.adaptees.ConsoleLogger) adaptee).printError("ERROR", message, throwable);
                break;
            case FILE:
                ((structural.adapter.adaptees.FileLogger) adaptee).writeError(message, throwable);
                break;
        }

    }
}
