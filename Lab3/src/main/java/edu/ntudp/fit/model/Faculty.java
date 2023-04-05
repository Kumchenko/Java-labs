package edu.ntudp.fit.model;

import java.util.List;

public class Faculty extends Structure{

    public Faculty(String name) {
        super(name);
    }

    public Faculty(String name, Creature head) {
        super(name, head);
    }

    public Faculty(String nameOfStructure, Creature headOfStructure, List childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }
}
