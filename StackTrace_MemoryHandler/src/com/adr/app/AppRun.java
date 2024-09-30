package com.adr.app;

import com.adr.service.MemoryHandlerControler;


public class AppRun {
    
    public static void main (String[] args)
    {
        System.out.println("TESTING RUN..");
        
        MemoryHandlerControler ctrMemoryHandler = new MemoryHandlerControler();
        ctrMemoryHandler.runException();
    }
    
}
