package edu.ntudp.fit.model;

public class Human implements ICreature {
    private String name;
    private String surname;
    private String patronymic;
    private Sex sex;
    public Boolean isAlive() {
        System.out.printf("I`m %s and I'm alive!!!", this.name);
        return true;
    }

    public String toString() {
        return this.surname + ' ' + this.name + ' ' + this.patronymic + " Sex: " + this.sex;
    }

    public Human(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }
}
