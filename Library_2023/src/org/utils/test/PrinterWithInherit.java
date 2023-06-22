package org.utils.test;

public class PrinterWithInherit <T extends Animal> {
//    public class PrinterWithInherit <T extends Animal & Serializable> {

    private T thingToPrint;
    private String printToDo;

    public PrinterWithInherit() {
    }

    public PrinterWithInherit(T thingToPrint, String printToDo) {
        this.thingToPrint = thingToPrint;
        this.printToDo = printToDo;
    }

    public void print(){
        System.out.println(thingToPrint.animalDo(printToDo));
    }
}
