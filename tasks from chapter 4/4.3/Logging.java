package Task43;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Logging {
    private static void configureLogging() {
        Logger LOGGER_A = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger LOGGER_B = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger LOGGER = Logger.getLogger("org.stepic.java");

        LOGGER_A.setLevel(Level.ALL);
        LOGGER_B.setLevel(Level.WARNING);
        LOGGER.setLevel(Level.ALL);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());

        LOGGER.addHandler(handler);
        LOGGER.setUseParentHandlers(false);
        
    }
}
