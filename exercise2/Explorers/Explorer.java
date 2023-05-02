package Explorers;

import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Saturn;
import Planets.Pluto;
import Planets.Planet;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Neptune neptune);

    void visit(Pluto pluto);


    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}