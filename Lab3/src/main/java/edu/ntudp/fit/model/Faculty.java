package edu.ntudp.fit.model;

import java.util.List;

public class Faculty extends Structure{

    public Faculty(String name) {
        super(name);
    }

    public Faculty(String name, ICreature head) {
        super(name, head);
    }

    public Faculty(String nameOfStructure, ICreature headOfStructure, List childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }

}
