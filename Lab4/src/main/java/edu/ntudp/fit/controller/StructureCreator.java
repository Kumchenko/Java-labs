package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class StructureCreator<T, C> implements Creatable<T> {

    public String structureType;
    public String childType;

    public StructureCreator(String structureType, String childType) {
        this.structureType = structureType;
        this.childType = childType;
    }

    @Override
    public T create() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input the Name of created %s: ", structureType);
        String nameOfStructure = scanner.next();

        System.out.printf("Creating the Head of %s %s...\n", structureType, nameOfStructure);
        Human headOfStructure = new HumanCreator().create();

        System.out.printf("Input the Quantity of %s in the %s: ", childType, structureType);
        Integer childLength = scanner.nextInt();
        List<C> childOfStructure = new ArrayList<>(childLength);

        return create(nameOfStructure, headOfStructure, createChildList(childLength, nameOfStructure));
    }

    public abstract T create(String nameOfStructure, Human headOfStructure, List<C> childOfStructure);

    public abstract T createRandomly();

    public abstract List<C> createChildList(Integer length, String nameOfStructure);

    public abstract List<C> createChildListRandomly();
}
