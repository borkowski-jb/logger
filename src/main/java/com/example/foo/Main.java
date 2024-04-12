package com.example.foo;

class Logger {
    public static void info(String message) {
        //TODO
    }
}

class Orderer {
    //CANNOT BE CHANGED OR ANY CONSTRUCTOR ADDED
    private final Worker worker = new Worker();

    void order(String username){
        worker.work();
    }
}

class Worker {
    void work(){
        Logger.info("Doing hard work");
    }
}

public class Main {
    public static void main(String[] args) {
        Orderer orderer = new Orderer();
        orderer.order("John");
        orderer.order("Jack");
    }
}
