package edu.ntudp.fit.model;

import java.util.List;

public class Group extends Structure {

    public Group(String name) {
        super(name);
    }
    public Group(String name, Creature head) {
        super(name, head);
    }

    public Group(String nameOfStructure, Creature headOfStructure, List<Entity> childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }
}
