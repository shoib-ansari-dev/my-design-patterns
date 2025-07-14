package structural.adapter;

public class AppService {
    private final AppLogger logger;

    public AppService(AppLogger logger) {
        this.logger = logger;
    }

    public void run(){
        logger.debug("Service is starting...");
        try {
            int x= 1/0;
        }catch (Exception e){
            logger.error("An error occurred in the service", e);
        }
    }

    public static void main(String[] args) {

        AppLogger legacy = LoggerAdapter.legacyLogger();
        new AppService(legacy).run();
        AppLogger console = LoggerAdapter.consoleLogger();
        new AppService(console).run();
        AppLogger file = LoggerAdapter.fileLogger("app.log");
        new AppService(file).run();
    }
}
