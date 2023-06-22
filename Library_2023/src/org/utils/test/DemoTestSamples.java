package org.utils.test;

import java.util.ArrayList;
import java.util.List;

public class DemoTestSamples {

    public static void main(String[] args) {
//        testGenerics();
//        testGenericsWithInheritance();
        testGenericsWithWildcardInit();
    }

    private static void testGenericsWithWildcardInit(){
        List<String> listS = new ArrayList<>();
        listS.add("Pesho");
        testGenericsWithWildcard(listS);

        List<Integer> listN = new ArrayList<>();
        listN.add(5);
        testGenericsWithWildcard(listN);
    }

    private static void testGenericsWithWildcard(List<?> list) {
        System.out.println(list);
    }

    private static void testGenericsWithInheritance() {
        PrinterWithInherit<Cat> printCat = new PrinterWithInherit<Cat>(new Cat(), "meaw");
        printCat.print();
    }

    private static void testGenerics() {
        Integer number = getData(5);
        String name = getData("Pesho");
        System.out.println(number);
        System.out.println(name);
    }

    private static <T> T getData(T print) {
        Printer<T> tPrinter = new Printer<>(print);
        return tPrinter.getPrint();
    }

}


