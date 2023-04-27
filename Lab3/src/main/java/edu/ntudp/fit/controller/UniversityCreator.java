package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Entity;
import edu.ntudp.fit.model.Faculty;
import edu.ntudp.fit.model.Creature;
import edu.ntudp.fit.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator extends StructureCreator{

    public UniversityCreator() {
        super("University", "Faculty");
    }

    @Override
    public University create(String nameOfStructure, Creature headOfStructure, List<Entity> childOfStructure) {
        return new University(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public List<Entity> createChildList(Integer length, String nameOfStructure) {
        List<Entity> childList = new ArrayList<>(length);
        FacultyCreator facultyCreator = new FacultyCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(facultyCreator.create());
        }
        return childList;
    }

    @Override
    public University createRandomly() {
        return new University("NTU", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Entity> createChildListRandomly() {
        List<Entity> childList = new ArrayList<>(2);
        Creatable facultyCreator = new FacultyCreator();
        for (int i = 0; i < 2; i++) {
            childList.add(facultyCreator.createRandomly());
        }
        return childList;
    }
}
