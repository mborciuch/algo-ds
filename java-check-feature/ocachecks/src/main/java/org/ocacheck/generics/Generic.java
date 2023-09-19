package org.ocacheck.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Generic {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        takeListOfString(stringList);

        covariantTakeListOfString(stringList);
//        covariantTakeListOfString(objectList);

        contravariantTakeListOfString(stringList);
        contravariantTakeListOfString(objectList);

//        takeListOfObjects(stringList);
        takeListOfObjects(objectList);

        List<C> cList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<B2> b2List = new ArrayList<>();
        List<A> aList = new ArrayList<>();

        C c = new C();

        contravariantTakeListOfC(cList);
        contravariantTakeListOfC(bList);
//        contravariantTakeListOfC(b2List);
        contravariantTakeListOfC(aList);

        takeListOfC(cList);
//        takeListOfC(bList);
//        takeListOfC(b2List);
//        takeListOfC(aList);

        takeC(new C());
//        takeC(new B());
//        takeC(new A());

//        contravariantTakeListOfB(cList);
        contravariantTakeListOfB(bList);
        contravariantTakeListOfB(aList);

//        takeListOfB(cList);
        takeListOfB(bList);
//        takeListOfB(aList);

        takeB(new C());
        takeB(new B());
//        takeB(new A());

    }


    public static void takeListOfString(List<String> stringList) {

    }

    public static void takeListOfObjects(List<Object> stringList) {

    }

    public static void  covariantTakeListOfString(List<? extends String> stringList) {

    }

    public static void contravariantTakeListOfString(List<? super String> stringList) {
        stringList.add("Hello");
//        stringList.add(new Object());
//        Object o = stringList.get(0);
//        String s = stringList.get(0);
    }

    public static void contravariantTakeListOfC(List<? super C> cList){
        Object object = cList.get(0);
    }

    public static void takeListOfC(List<C> cList){
        C c = cList.get(0);
    }

    public static void takeC(C c){

    }

    public static void contravariantTakeListOfB(List<? super B> bList){

    }

    public static void takeListOfB(List<B> bList){
      bList.get(0);
    }

    public static void takeB(B b){

    }

    public static void compareB() {
            compareBInternal(new AComparator());
    }

    public static void compareBInternal(Comparator<? super B> bComparator){
        B b1 = new B();
        B b2 = new B();
        bComparator.compare(b1, b2);
    }


   static class A {
        void printA(){
            System.out.println("Print a");
        }
    }

    static class B extends A {
        void printB(){
            System.out.println("Print b");
        }
    }

    static class B2 extends A {
        void printB2(){
            System.out.println("Print b2");
        }
    }

    static class C extends B {
        void printC(){
            System.out.println("Print b2");
        }
    }

    static class AComparator implements Comparator<A>{

        @Override
        public int compare(A o1, A o2) {
            return o1.hashCode() - o2.hashCode();
        }
    }
}

