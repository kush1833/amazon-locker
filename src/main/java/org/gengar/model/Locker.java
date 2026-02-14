package org.gengar.model;

public class Locker {
    // Locker - id, list of compartment by size (s,m,l),
    private Compartment[] smallCompartments;
    private Compartment[] mediumCompartments;
    private Compartment[] largeCompartments;

    public Locker(int totalSmall, int totalMedium, int totalLarge) {
        this.smallCompartments = new Compartment[totalSmall];
        this.mediumCompartments = new Compartment[totalMedium];
        this.largeCompartments = new Compartment[totalLarge];
    }

    public Compartment[] getSmallCompartments() {
        return smallCompartments;
    }

    public Compartment[] getMediumCompartments() {
        return mediumCompartments;
    }

    public Compartment[] getLargeCompartments() {
        return largeCompartments;
    }
}
