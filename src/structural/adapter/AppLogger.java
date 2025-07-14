package structural.adapter;

public interface AppLogger {
    void debug(String message);
    void infor(String message);
    void warn(String message);
    void error(String message, Throwable throwable);
}
