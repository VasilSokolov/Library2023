package org.utils.test;

public class Printer <T>{

    private T print;

    public Printer(T print) {

        this.print = print;
    }

    public T getPrint() {
        return print;
    }

    public void setPrint(T print) {
        this.print = print;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "print=" + print +
                '}';
    }
}
