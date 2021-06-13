package core;

import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

    //private LoggerService service;
/*
    public JLoggerManagerAdapter(LoggerService service) {
        this.service = service;
    }*/

    @Override
    public void logToSystem(String message) {

        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(message);
    }
}
