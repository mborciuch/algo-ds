package org.javainterviewquestion;

public class ReverseString12 {

    public static void main(String[] args) {
        WithDefault.printHello();
    }

    public static String  reverseString(String str) {
        char[] chars = str.toCharArray();
        char[] result = new char[chars.length];
        int position = 0;
        for(int i = chars.length - 1; i >= 0; i-- ) {
            position = Math.abs(i - (result.length - 1));
            result[position] = chars[i];
        }

        return new String(result);
    }
}

interface WithDefault {
    static void  printHello(){
        System.out.println("Hello, World");
    }
}


