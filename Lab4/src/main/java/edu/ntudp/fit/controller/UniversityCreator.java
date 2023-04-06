package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Faculty;
import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator extends StructureCreator<University, Faculty>{

    public UniversityCreator() {
        super("University", "Faculty");
    }

    @Override
    public University create(String nameOfStructure, Human headOfStructure, List<Faculty> childOfStructure) {
        return new University(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public University createRandomly() {
        return new University("NTU", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Faculty> createChildList(Integer length, String nameOfStructure) {
        List<Faculty> childList = new ArrayList<>(length);
        FacultyCreator facultyCreator = new FacultyCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(facultyCreator.create());
        }
        return childList;
    }

    @Override
    public List<Faculty> createChildListRandomly() {
        List<Faculty> childList = new ArrayList<>(2);
        FacultyCreator facultyCreator = new FacultyCreator();
        for (int i = 0; i < 2; i++) {
            childList.add(facultyCreator.createRandomly());
        }
        return childList;
    }
}
