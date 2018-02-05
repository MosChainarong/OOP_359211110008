package ooplab9;

public class CarApp {
    public static void main(String[] args) {
        Engine e = new Engine("2000 cc","V-Tec V4");
        car c = new car("Honda","City",
                "black",e);

        System.out.println(c.toString());







    }//main

}//class
