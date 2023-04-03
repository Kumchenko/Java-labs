package edu.ntudp.fit;

import edu.ntudp.fit.controller.UniversityCreator;
import edu.ntudp.fit.model.University;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Beginning work");
        UniversityCreator universityCreator = new UniversityCreator();
        universityCreator.create();
    }
}