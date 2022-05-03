package org.example.java8;

import java.util.*;
public class Test {
    static ArrayList a = new ArrayList();

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread() {
            public void run() {
                Object x = null;
                int i = 0;
                while (i <= 30) {
                    if (a.size() > 0) {
                        Object y = a.remove(0);
                        if (x == y){
                            System.out.println("Duplicate!");
                        }
                        x = y;
                    }
                    i = i +1;
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                while (a.size() < 100) {
                    a.add(new Object());
                }
            }
        };

        t2.start();
        Thread.sleep(100);
        t1.start();
    }
}