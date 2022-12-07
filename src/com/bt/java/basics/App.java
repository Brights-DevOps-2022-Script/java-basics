package com.bt.java.basics;

public class App {
    /*
     * Jedes Java-Programm hat eine statische Main-Methode als
     * Einsprungspunkt.
     */
    public static void main(String[] args) throws Exception {

        // Die Funktion 'println' schreibt den Text in "" auf die Konsole.
        System.out.println("Hallo DevOps-Klasse");

        // Exercise 1: Perform a widening, explicit type conversion with int and short
        short valueShort = 128;
        int valueInt = (int) valueShort;
        System.out.println("Exercise 1: " + valueInt);

        // Exercise 2: Perform a constraining, explicit type conversion with int and byte
        int valueInt2 = 1308;
        byte valueByte2 = (byte) valueInt2;
        System.out.println("Exercise 2: " + valueByte2);

        // Exercise 3: Perform a widening, implicit type conversion with short and float​
        short valueShort3 = 19999;
        float valueFloat3 = valueShort3;
        System.out.println("Exercise 3: " + valueFloat3);

        // Exercise 4: Perform a constraining, implicit type conversion with short and float in a division​
        short valueShort4 = 5;
        float division4 = valueShort4 / 2;
        System.out.println("Exercise 4: " + division4);

        /* 
         * Exercise 5: Rewrite the arithmetic expression from exercise 4 
         * into a correct expression with implicit type conversion​
         */
        float devision5 = valueShort4 / 2.0f;
        System.out.println("Exercise 5: " + devision5);

        /*
         * Aufgabe 6: Rewrite the arithmetic expression from exercise 4 
         * into a correct expression with explicit type conversion​
         */
        float devision6 = valueShort4 / (float) 2;
        System.out.println("Exercise 6: " + devision6);

    }   

}
