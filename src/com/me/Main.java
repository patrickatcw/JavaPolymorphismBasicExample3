package com.me;

public class Main {

    public static void main(String[] args) {

        //step 9 horse instance and calling sound method
        //from the new animal obj
        Animal obj = new Horse();
        obj.sound();

        //step 10 cat instance and calling sound method
        //from the new animal obj
        Animal obj2 = new Cat();
        obj2.sound();

        //step 11 run....
        //result;
        /*
        Neigh
        Meow
         */

    }

}

//explanation;
/*
in the animal class, once the method is called from the class, the "Animal is making a sound" should print.
the override methods in the horse and cat class that extends animal use override methods that override the
sound method in animal class.  the specific instances make a new animal object and call the specific method for both
the horse and the cat
 */
