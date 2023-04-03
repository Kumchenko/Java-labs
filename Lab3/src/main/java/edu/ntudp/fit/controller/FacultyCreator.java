package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Department;
import edu.ntudp.fit.model.Faculty;
import edu.ntudp.fit.model.ICreature;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator extends StructureCreator<Faculty, Department>{

    public FacultyCreator() {
        super("Faculty", "Department");
    }

    public Faculty create(String nameOfStructure, ICreature headOfStructure, List<Department> childOfStructure) {
        return new Faculty(nameOfStructure, headOfStructure, childOfStructure);
    }
    public List<Department> createChildList(Integer length, String nameOfStructure) {
        List<Department> childList = new ArrayList<>(length);
        DepartmentCreator departmentCreator = new DepartmentCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(departmentCreator.create());
        }
        return childList;
    }
}
