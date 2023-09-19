package org.javainterviewquestion;

public class SingletonClass20 {
    private volatile static SingletonClass20 singleton;

    private SingletonClass20(){

    }

    public static SingletonClass20 getInstance(){
        if(singleton == null) {
            synchronized (SingletonClass20.class) {
                if (singleton == null) {
                    singleton = new  SingletonClass20();
                }
            }
        }
      return singleton;
    }
}
