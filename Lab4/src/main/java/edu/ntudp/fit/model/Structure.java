package edu.ntudp.fit.model;

import java.util.List;
import java.util.Objects;

public class Structure<T> {
    private String nameOfStructure;
    private Human headOfStructure;
    private List<T> childOfStructure;

    public String getNameOfStructure() {
        return nameOfStructure;
    }

    public void setNameOfStructure(String nameOfStructure) {
        this.nameOfStructure = nameOfStructure;
    }

    public Human getHeadOfStructure() {
        return headOfStructure;
    }

    public void setHeadOfStructure(Human headOfStructure) {
        this.headOfStructure = headOfStructure;
    }

    public List<T> getChildOfStructure() {
        return childOfStructure;
    }

    public void setChildOfStructure(List<T> childOfStructure) {
        this.childOfStructure = childOfStructure;
    }

    public Structure() {
    }

    public Structure(String name) {
        this.nameOfStructure = name;
    }

    public Structure(String name, Human head) {
        this.nameOfStructure = name;
        this.headOfStructure = head;
    }

    public Structure(String nameOfStructure, Human headOfStructure, List<T> childOfStructure) {
        this.nameOfStructure = nameOfStructure;
        this.headOfStructure = headOfStructure;
        this.childOfStructure = childOfStructure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Structure<?> structure = (Structure<?>) o;
        return Objects.equals(nameOfStructure, structure.nameOfStructure) && Objects.equals(headOfStructure, structure.headOfStructure) && Objects.equals(childOfStructure, structure.childOfStructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStructure, headOfStructure, childOfStructure);
    }
}
