package core;

import core.abstracts.LoggerService;
import jLogger.JloggerManager;

public class JLoggerAdapter implements LoggerService {


    @Override
    public void logToSystem(String message) {

       JloggerManager manager = new JloggerManager();
        manager.log(message);


    }
}
