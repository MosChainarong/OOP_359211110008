package ooplab6;

import java.util.ArrayList;
import java.util.Arrays;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("Tan");
        System.out.println(myList);
        myList.add("kwang");
        myList.add("Ploy");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,100);
        System.out.println(myList);
        myList.set(0,"Thadarat");
        System.out.println(myList);
        myList.remove("Hello");
        System.out.println(myList);
        System.out.println(myList.indexOf(100));



    }//main
}//class