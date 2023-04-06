package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Structure;
import edu.ntudp.fit.model.University;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class JsonManagerTest {

    @Test
    public void writeAndRead() throws IOException {
        JsonManager jsonManager = new JsonManager<>(University.class);
        Structure university = new UniversityCreator().createRandomly();

        jsonManager.writeToFile(university, "test.json");
        Structure readUniversity = (University) jsonManager.readFromFile("test.json");

        assertEquals(university, readUniversity);
    }
}