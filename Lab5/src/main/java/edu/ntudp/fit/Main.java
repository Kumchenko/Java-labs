package edu.ntudp.fit;

import edu.ntudp.fit.contoller.StudentController;
import edu.ntudp.fit.viewer.StudentViewer;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        // Format of date "dd.MM.yyyy"
        StudentViewer.viewMany(StudentController.findStudentsInDb("01.01.2003", "01.04.2003"));
    }
}