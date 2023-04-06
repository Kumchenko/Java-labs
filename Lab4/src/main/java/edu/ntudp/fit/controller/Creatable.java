package edu.ntudp.fit.controller;

public interface Creatable<T> {
    T create();
    T createRandomly();
}
