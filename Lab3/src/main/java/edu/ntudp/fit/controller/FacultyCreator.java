package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Entity;
import edu.ntudp.fit.model.Faculty;
import edu.ntudp.fit.model.Creature;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator extends StructureCreator{

    public FacultyCreator() {
        super("Faculty", "Department");
    }

    @Override
    public Faculty create(String nameOfStructure, Creature headOfStructure, List<Entity> childOfStructure) {
        return new Faculty(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public List<Entity> createChildList(Integer length, String nameOfStructure) {
        List<Entity> childList = new ArrayList<>(length);
        DepartmentCreator departmentCreator = new DepartmentCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(departmentCreator.create());
        }
        return childList;
    }

    @Override
    public Faculty createRandomly() {
        return new Faculty("FIT", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Entity> createChildListRandomly() {
        List<Entity> childList = new ArrayList<>(2);
        Creatable departmentCreator = new DepartmentCreator();
        for (int i = 0; i < 2; i++) {
            childList.add(departmentCreator.createRandomly());
        }
        return childList;
    }
}
