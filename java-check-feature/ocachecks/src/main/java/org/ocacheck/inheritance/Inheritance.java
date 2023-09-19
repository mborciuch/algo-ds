package org.ocacheck.inheritance;

public class Inheritance {
}

interface AInterface {
    void printHello();
}

interface BIntrrface {
    String printHello();
}
abstract class AAbstractClass implements AInterface {

}



class AConcreteClass extends AAbstractClass {

    @Override
    public void printHello() {

    }
}

//class BConcreteClasss implements AInterface, BIntrrface {
//
//    //clash
//    @Override
//    public void printHello() {
//
//    }
//}
