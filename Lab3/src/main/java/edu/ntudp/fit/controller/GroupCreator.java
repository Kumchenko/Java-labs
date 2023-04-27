package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.*;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator extends StructureCreator{
    public GroupCreator() {
        super("Group", "Student");
    }

    @Override
    public Group create(String nameOfStructure, Creature headOfStructure, List<Entity> childOfStructure) {
        return new Group(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public List<Entity> createChildList(Integer length, String nameOfStructure) {
        List<Entity> childList = new ArrayList<>(length);
        StudentCreator studentCreator = new StudentCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add(studentCreator.create());
        }
        return childList;
    }

    @Override
    public Group createRandomly() {
        return new Group("121-20-2", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Entity> createChildListRandomly() {
        List<Entity> childList = new ArrayList<>(2);
        Creatable studentCreator = new StudentCreator();
        for (int i = 0; i < 2; i++) {
            childList.add(studentCreator.createRandomly());
        }
        return childList;
    }
}
