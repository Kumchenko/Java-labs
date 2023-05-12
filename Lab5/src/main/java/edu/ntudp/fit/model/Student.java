package edu.ntudp.fit.model;

import java.util.Date;
import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;
    private Date birthday;
    private Integer recordBookNum;

    public Student(Integer id, String name, String surname, String patronymic, Date birthday, Integer recordBookNum) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.recordBookNum = recordBookNum;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Integer getRecordBookNum() {
        return recordBookNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", recordBookNum=" + recordBookNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id) && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(patronymic, student.patronymic) && Objects.equals(birthday, student.birthday) && Objects.equals(recordBookNum, student.recordBookNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, birthday, recordBookNum);
    }
}
