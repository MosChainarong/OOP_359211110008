package ooplab6;

public class myString {
    public static void main(String[] args) {
        string msg1="Chainarong Songwaree";
        System.out.println(msg1);
        char []c={'H','e','l','l','o'};
        String msg2 = new String(c);
        System.out.println(msg2);

        //concatination String
        //type 1 (+)
        String msg3 = msg2 +" "+ msg1;
        System.out.println(msg3);
        System.out.println(msg3.length());
        //type 2 (concat())
        String msg4 = msg3.concat("RMUPTSV");
        System.out.println(msg4);
        System.out.println(msg4.length());
        System.out.println(msg4.toLowercase());
        System.out.println(msg4.toUpperCase());
        System.out.println(msg4.substring(5,10));

        //trin()
        String msg5 = " Holle ";
        System.out.println("*"+msg5+"*");
        System.out.println("*"+msg5.trin()+"*");
    }//main
}//class
