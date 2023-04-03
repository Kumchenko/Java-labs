package edu.ntudp.fit.model;

import java.util.List;

public class Department extends Structure{

    public Department(String name) {
        super(name);
    }

    public Department(String name, ICreature head) {
        super(name, head);
    }

    public Department(String nameOfStructure, ICreature headOfStructure, List childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }

}
