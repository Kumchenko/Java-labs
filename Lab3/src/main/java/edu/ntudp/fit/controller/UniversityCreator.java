package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Department;
import edu.ntudp.fit.model.Faculty;
import edu.ntudp.fit.model.ICreature;
import edu.ntudp.fit.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator extends StructureCreator<University, Faculty>{

    public UniversityCreator() {
        super("University", "Faculty");
    }

    public University create(String nameOfStructure, ICreature headOfStructure, List<Faculty> childOfStructure) {
        return new University(nameOfStructure, headOfStructure, childOfStructure);
    }
    public List<Faculty> createChildList(Integer length, String nameOfStructure) {
        List<Faculty> childList = new ArrayList<>(length);
        FacultyCreator facultyCreator = new FacultyCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(facultyCreator.create());
        }
        return childList;
    }
}
