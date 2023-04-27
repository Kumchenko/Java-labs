package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.*;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator extends StructureCreator {
    public DepartmentCreator() {
        super("Department", "Group");
    }

    @Override
    public Department create(String nameOfStructure, Creature headOfStructure, List<Entity> childOfStructure) {
        return new Department(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public List<Entity> createChildList(Integer length, String nameOfStructure) {
        List<Entity> childList = new ArrayList<>(length);
        GroupCreator groupCreator = new GroupCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(groupCreator.create());
        }
        return childList;
    }

    @Override
    public Department createRandomly() {
        return new Department("PZKS", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Entity> createChildListRandomly() {
        List<Entity> childList = new ArrayList<>(2);
        Creatable groupCreator = new GroupCreator();
        for (int i = 0; i < 2; i++) {
            childList.add(groupCreator.createRandomly());
        }
        return childList;
    }
}
