package edu.ntudp.fit.model;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private Sex sex;
    public Boolean isAlive() {
        System.out.printf("I`m %s and I'm alive!!!", this.name);
        return true;
    }

    public Human() {
    }

    public Human(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.surname + ' ' + this.name + ' ' + this.patronymic + " Sex: " + this.sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(patronymic, human.patronymic) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, sex);
    }
}
