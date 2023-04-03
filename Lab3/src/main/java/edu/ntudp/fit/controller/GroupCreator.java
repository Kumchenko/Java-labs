package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Group;
import edu.ntudp.fit.model.ICreature;
import edu.ntudp.fit.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator extends StructureCreator<Group, Student> {
    public GroupCreator() {
        super("Group", "Student");
    }

    public Group create(String nameOfStructure, ICreature headOfStructure, List<Student> childOfStructure) {
        return new Group(nameOfStructure, headOfStructure, childOfStructure);
    }
    public List<Student> createChildList(Integer length, String nameOfStructure) {
        List<Student> childList = new ArrayList<>(length);
        StudentCreator studentCreator = new StudentCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(studentCreator.create());
        }
        return childList;
    }
}
