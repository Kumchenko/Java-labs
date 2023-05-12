package edu.ntudp.fit.viewer;

import edu.ntudp.fit.model.Student;

import java.util.List;

public class StudentViewer {
    public static void viewOne(Student st) {
        System.out.printf("ID: %d%n Full name: %s %s %s%n RecordBookID: %d%n Birthday: " + st.getBirthday() + "\n\n",
                st.getId(),
                st.getSurname(),
                st.getName(),
                st.getPatronymic(),
                st.getRecordBookNum()
        );
    }

    public static void viewMany(List<Student> students) {
        students.stream().forEach(student -> viewOne(student));
    }
}
