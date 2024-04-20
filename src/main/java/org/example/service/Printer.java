package org.example.service;

public class Printer {
    public static String calcDecorate(int num){
        return String.format("Result of operation: %d", num);
    }

    public static String compareDecorate(boolean result){
        if(result){
            return "first one is bigger or they equals";
        }
        else{
            return "second one is bigger";
        }
    }
}
