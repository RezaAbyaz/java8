package org.example.java8.IOC;

public class C {

    private A a;

    public C(A a) {
        this.a = a;
    }

    public void calculate(){
        a.calculate();
    }
}
