package org.example;

import org.example.service.Calculator;
import org.example.service.Compare;
import org.example.service.Printer;

public class Program {
    /*
    javac -sourcepath ./java -d output java/org/example/Program.java компиляция
    java -classpath ./output org.example.Program исполнение
     */
    public static void main(String[] args) {
        int result = Calculator.sum(5,5);
        System.out.println(Printer.calcDecorate(result));
        result = Calculator.subtract(8, 5);
        System.out.println(Printer.calcDecorate(result));
        result = Calculator.multiply(8, 5);
        System.out.println(Printer.calcDecorate(result));
        result = Calculator.div(8, 2);
        System.out.println(Printer.calcDecorate(result));

        boolean compare = Compare.compare(6, 4);
        System.out.println(Printer.compareDecorate(compare));
        compare = Compare.compare(2, 4);
        System.out.println(Printer.compareDecorate(compare));
    }
}