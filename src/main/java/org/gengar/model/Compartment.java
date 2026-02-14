package org.gengar.model;

public class Compartment {
    private static int uniqueId = 0;
//    id, state (Occupied, Empty, Expired), size (s,m,l)
    private final int id;
    private State state;
    private Size size;

    public Compartment(Size size) {
        this.id = uniqueId++;// use id generator
        this.state = State.AVAILABLE;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
