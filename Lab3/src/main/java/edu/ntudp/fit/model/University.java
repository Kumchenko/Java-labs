package edu.ntudp.fit.model;

import java.util.List;

public class University extends Structure {
    public University(String name) {
        super(name);
    }

    public University(String name, ICreature head) {
        super(name, head);
    }

    public University(String nameOfStructure, ICreature headOfStructure, List childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }

}
