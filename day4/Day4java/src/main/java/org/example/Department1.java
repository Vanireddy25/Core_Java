package org.example;
public class Department1 extends Department{
    private int size;

    public Department1(int size) {
        this.size = size;
    }

    @Override
    public int getDepartmenSize() {
        return size;
    }
}

