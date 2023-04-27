package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Entity;
import edu.ntudp.fit.model.Structure;

public interface Creatable {
    Entity create();
    Entity createRandomly();
}
