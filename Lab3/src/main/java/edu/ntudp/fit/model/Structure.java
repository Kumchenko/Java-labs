package edu.ntudp.fit.model;

import java.util.List;
import java.util.Objects;

public class Structure implements Entity {
    private String nameOfStructure;
    private Creature headOfStructure;
    private List<Entity> childOfStructure;

    public String getNameOfStructure() {
        return nameOfStructure;
    }

    public void setNameOfStructure(String nameOfStructure) {
        this.nameOfStructure = nameOfStructure;
    }

    public Creature getHeadOfStructure() {
        return headOfStructure;
    }

    public void setHeadOfStructure(Creature headOfStructure) {
        this.headOfStructure = headOfStructure;
    }

    public List<Entity> getChildOfStructure() {
        return childOfStructure;
    }

    public void setChildOfStructure(List<Entity> childOfStructure) {
        this.childOfStructure = childOfStructure;
    }

    public Structure(String name) {
        this.nameOfStructure = name;
    }

    public Structure(String name, Creature head) {
        this.nameOfStructure = name;
        this.headOfStructure = head;
    }

    public Structure(String nameOfStructure, Creature headOfStructure, List<Entity> childOfStructure) {
        this.nameOfStructure = nameOfStructure;
        this.headOfStructure = headOfStructure;
        this.childOfStructure = childOfStructure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Structure)) return false;
        Structure structure = (Structure) o;
        return Objects.equals(nameOfStructure, structure.nameOfStructure) && Objects.equals(headOfStructure, structure.headOfStructure) && Objects.equals(childOfStructure, structure.childOfStructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStructure, headOfStructure, childOfStructure);
    }
}
