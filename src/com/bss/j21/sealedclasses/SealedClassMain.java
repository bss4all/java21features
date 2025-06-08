package com.bss.j21.sealedclasses;

sealed class Human permits Manish, Vartika, Anjali {
    public Human() {
        System.out.println("in Human");
    }
    public void printName() {
        System.out.println("Default");
    }
}

non-sealed class Manish extends Human {
    public Manish() {System.out.println("in Manish");}
    public void printName() {
        super.printName();
        //System.out.println("Manish Sharma");
    }
}

sealed class Vartika extends Human {
    public Vartika() {System.out.println("in Vartika");}
    public void printName() {
        System.out.println("Vartika Dadheech");
    }
}

final class VartikaSon extends Vartika {
    public VartikaSon() {System.out.println("in VartikaSon");}
    public void printName() {
        System.out.println("VartikaSon Vartika Dadheech");
    }
}


final class Anjali extends Human {
    public Anjali() {System.out.println("in Anjali");}
    public void printName() {
        System.out.println("Anjali Sharma");
    }
}

public class SealedClassMain {
    public static void main(String[] args) {
        Human h1 = new Anjali();
        //Human h2 = new Vartika();
        //Human h3 = new Manish();
        //Human h4 = new VartikaSon();
        //Human h5 = new Human();

        h1.printName();
        //h2.printName();
        //h3.printName();
        //h4.printName();
        //h5.printName();
    }
}
