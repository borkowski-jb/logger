package com.example.foo;

public class Orderer {
    //CANNOT BE CHANGED OR ANY CONSTRUCTOR ADDED
    private final Worker worker = new Worker();

    void order(String username){
        worker.work();
    }
}
