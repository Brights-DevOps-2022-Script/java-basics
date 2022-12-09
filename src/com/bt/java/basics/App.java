package com.bt.java.basics;
import java.util.*;

public class App {
    
    static void halloDevOps(){
    // Die Funktion 'println' schreibt den Text in "" auf die Konsole.
        System.out.println("Hallo DevOps-Klasse");
    }
    
    static void exercisesOne(){
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

        static void operatorExercise() {
            //Inkremental Operator
        byte age = 26;
        age++;
        System.out.println("Happy Birthday! Age is now " + age + "!");

        //Associative Operators
        int cash = 100;
        cash += 200;
        System.out.println("Payday! You have now " + cash + "€!");
        
        //Modulo
        byte num = 20;
        int remainder = num % 2;
        System.out.println("The remainder of " + num + " divided by 2 is " + remainder);
    }

    static void booleanExercise() {
        
        //Boolsche Operatoren
        boolean foo = true;
        boolean bar = false;
        boolean fooOne = false;
        boolean barOne = true;
        
        if(foo && bar){
            System.out.println("Test 1: Everything is true!");
        }else if(foo || bar){
            System.out.println("Test 1: Something is true!");
        }else{
            System.out.println("Test 1: Not everything is true!");
        }
        
        if(foo && barOne){
            System.out.println("Test 2: Everything is true!");
        }else if(foo || barOne){
            System.out.println("Test 2: Something is not true!");
        }else{
            System.out.println("Test 2: Not everything is true!");
        }
        
        if(bar && fooOne){
            System.out.println("Test 3: Everything is true!");
        }else if(bar || fooOne){
            System.out.println("Test 3: Something is not true!");
        }else{
            System.out.println("Test 3: Not everything is true!");
        }
    }

    static void countArray(){
        char[] word = { 'C', 'h', 'r', 'i', 's' };

        System.out.println("\nIterate normally!");
        for (int i = 0; i < word.length; i++){
            System.out.println(word[i]);
        }
        
        System.out.println("\nReverse iteration!");
        for (int i = word.length -1; i >= 0; i--){
            System.out.println(word[i]);
        }
    }

    static void autoboxing(){
        Integer x = 3;
        Double y = 5.0;

        System.out.println((x * 4) - (y / 8) + 7);
    }
    
    //Print Fizz for everything dividable by 3, Buzz for everything dividable by 5, and FizzBuzz if both is correct
    static void fizzBuzz(){
        
        System.out.println("\nFizzBuzz\n");

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    
    /*
     * Jedes Java-Programm hat eine statische Main-Methode als
     * Einsprungspunkt.
     */
    public static void main(String[] args) throws Exception {
        halloDevOps();
        
        //exercisesOne();
        
        //operatorExercise();
        
        //booleanExercise();      
        
        //countArray();
        
        fizzBuzz();
        
        //autoboxing();
    }   
    
}
