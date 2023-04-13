package edu.ntudp.fit.model;

import java.util.List;

public class University extends Structure<Faculty> {

    public University() { super(); }
    public University(String name) {
        super(name);
    }
    public University(String name, Human head) {
        super(name, head);
    }
    public University(String nameOfStructure, Human headOfStructure, List childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }
}
