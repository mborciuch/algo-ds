package org.ocacheck.enums;

import static org.ocacheck.enums.Symbol.A;
import static org.ocacheck.enums.Symbol.B;

interface Printer {
    void print();
}

enum Symbol implements Printer {

    A(5),  B(12), C(11);

    private final int value;

    Symbol(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}

public class Enums {

//    public static void main(String[] args) {
//        if(Symbol.A instanceof Symbol  s){
//
//        }
//        A = B;
//    }
}
