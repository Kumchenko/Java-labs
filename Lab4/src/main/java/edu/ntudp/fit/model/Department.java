package edu.ntudp.fit.model;

import java.util.List;

public class Department extends Structure{

    public Department() { super(); }
    public Department(String name) {
        super(name);
    }
    public Department(String name, Human head) {
        super(name, head);
    }
    public Department(String nameOfStructure, Human headOfStructure, List childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }
}
