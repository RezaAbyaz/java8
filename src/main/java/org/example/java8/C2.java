package org.example.java8;

import java.util.Comparator;

public class C2  implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return ((Student) o1).getLastName().compareToIgnoreCase(((Student) o2).getLastName());
    }
}
