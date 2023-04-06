package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Group;
import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.Sex;
import edu.ntudp.fit.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator extends StructureCreator<Group, Student> {
    public GroupCreator() {
        super("Group", "Student");
    }

    @Override
    public Group create(String nameOfStructure, Human headOfStructure, List<Student> childOfStructure) {
        return new Group(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public Group createRandomly() {
        return new Group("121-20-2", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Student> createChildList(Integer length, String nameOfStructure) {
        List<Student> childList = new ArrayList<>(length);
        StudentCreator studentCreator = new StudentCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(studentCreator.create());
        }
        return childList;
    }

    @Override
    public List<Student> createChildListRandomly() {
        List<Student> childList = new ArrayList<>(2);
        StudentCreator studentCreator = new StudentCreator();
        for (int i = 0; i < 2; i++) {
            childList.add(studentCreator.createRandomly());
        }
        return childList;
    }
}
