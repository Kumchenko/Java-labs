package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Department;
import edu.ntudp.fit.model.Faculty;
import edu.ntudp.fit.model.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator extends StructureCreator<Faculty, Department>{

    public FacultyCreator() {
        super("Faculty", "Department");
    }

    @Override
    public Faculty create(String nameOfStructure, Human headOfStructure, List<Department> childOfStructure) {
        return new Faculty(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public Faculty createRandomly() {
        return new Faculty("FIT", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Department> createChildList(Integer length, String nameOfStructure) {
        List<Department> childList = new ArrayList<>(length);
        DepartmentCreator departmentCreator = new DepartmentCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(departmentCreator.create());
        }
        return childList;
    }

    @Override
    public List<Department> createChildListRandomly() {
        List<Department> childList = new ArrayList<>(2);
        DepartmentCreator departmentCreator = new DepartmentCreator();
        for (int i = 0; i < 2; i++) {
            childList.add(departmentCreator.createRandomly());
        }
        return childList;
    }
}
