package com.training.week4.oops;

public class TypeCastingDemo {
    public static void main(String[] args) {

        Object obj = new String("Hello");
        String sObj = (String) obj;
/*        A b = (C) d;
*/
        //Errors/Compile Time
        String s1 = new String("Hello") ;
//        StringBuffer sb = (StringBuffer) s1; //Inconvertible Types

        String s2 = new String("Hello") ;
//        StringBuffer sb = (Object) s2;//Incompatible Types

        //Exception/Runtime
        Object o = new String("Hey");
        StringBuffer b = (StringBuffer) o;//ClassCastException

    }
}
