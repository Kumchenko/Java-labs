package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Department;
import edu.ntudp.fit.model.Group;
import edu.ntudp.fit.model.Creature;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator extends StructureCreator<Department, Group> {
    public DepartmentCreator() {
        super("Department", "Group");
    }

    @Override
    public Department create(String nameOfStructure, Creature headOfStructure, List<Group> childOfStructure) {
        return new Department(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public List<Group> createChildList(Integer length, String nameOfStructure) {
        List<Group> childList = new ArrayList<>(length);
        GroupCreator groupCreator = new GroupCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(groupCreator.create());
        }
        return childList;
    }
}
