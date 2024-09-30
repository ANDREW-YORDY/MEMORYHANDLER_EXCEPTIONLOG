package com.adr.service;

import java.util.logging.*;
import java.util.logging.Logger;



public class MemoryHandlerLogger {

    private final MemoryHandler memoryHandler;
    private static Logger logger;

    public MemoryHandlerLogger()
    {
        logger = Logger.getLogger(MemoryHandlerLogger.class.getName());
        memoryHandler =  new MemoryHandler(new ConsoleHandler(), 100, Level.SEVERE);
        logger.addHandler(memoryHandler);
    }
    
    public void logException(String excepMessage)
    {
        logger.severe(excepMessage);
    }

}
