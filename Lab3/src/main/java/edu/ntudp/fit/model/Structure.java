package edu.ntudp.fit.model;

import java.util.List;

public abstract class Structure<T> {
    private String nameOfStructure;
    private ICreature headOfStructure;
    private List<T> childOfStructure;

    public String getNameOfStructure() {
        return nameOfStructure;
    }

    public void setNameOfStructure(String nameOfStructure) {
        this.nameOfStructure = nameOfStructure;
    }

    public ICreature getHeadOfStructure() {
        return headOfStructure;
    }

    public void setHeadOfStructure(ICreature headOfStructure) {
        this.headOfStructure = headOfStructure;
    }

    public List<T> getChildOfStructure() {
        return childOfStructure;
    }

    public void setChildOfStructure(List<T> childOfStructure) {
        this.childOfStructure = childOfStructure;
    }

    public Structure(String name) {
        this.nameOfStructure = name;
    }

    public Structure(String name, ICreature head) {
        this.nameOfStructure = name;
        this.headOfStructure = head;
    }

    public Structure(String nameOfStructure, ICreature headOfStructure, List<T> childOfStructure) {
        this.nameOfStructure = nameOfStructure;
        this.headOfStructure = headOfStructure;
        this.childOfStructure = childOfStructure;
    }
}
