package com.adr.service;

import com.adr.ihandler.IMemoryHandler;
import java.util.ArrayList;
import java.util.List;


public class MemoryHandlerService implements IMemoryHandler
{    
    
    private final List<String> excepList = new ArrayList<>();
    
    @Override
    public void addException(String excepMessage)
    {
        excepList.add(excepMessage);
    }
    
    @Override
    public void showStoredException()
    {
        System.out.println("ERRORES ALMACENADOS TEMPORALMENTE: ");
        excepList.forEach(System.out::println);
    }
    
    public List<String> getExceptionList()
    {
        return excepList;
    }
}
