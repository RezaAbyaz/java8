package org.example.java8;

public interface Converter<F,T> {

    T convert(F from);
}
