package org.ocacheck.ch5;

public class Question2 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        if("Hello".equals(s)){
            System.out.println("Hello.equals(s))");
        }
        if(t == s){
            System.out.println("t == s");
        }
        ;
        if(t.intern() == s){
            System.out.println("t.intern == s");
        }
        if("Hello" == s){
            System.out.println("Hello == s");
        }
    }
}
