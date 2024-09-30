package com.adr.service;

public class MemoryHandlerControler 
{

    public void runException() {
        MemoryHandlerService ctrService = new MemoryHandlerService();
        MemoryHandlerLogger ctrLogger = new MemoryHandlerLogger();

        try {
            // Inducir un error (java.lang.ArrayIndexOutOfBoundsException)
            induceErrors();
        } catch (Exception e) {
            //Registrar el error.
            String exceptionMessage = "ERROR!: " + e.toString();
            ctrLogger.logException(exceptionMessage);  // Registrar con logger
            ctrService.addException(exceptionMessage); // Guardar en lista temporal
        }
        ctrService.showStoredException();
    }

    //Método para inducir el error.
    private static void induceErrors() throws Exception {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);
    }

}
