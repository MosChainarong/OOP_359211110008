package ooplab6;

public class myStrToken {
    public static void main(String[] args) {
        //StringTokenizer
        String msg = "Welcome to RUTSV";
        StringTokenizer myToken = new StringTokenizer (msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            stringBuffer myBuffer = new StringBuffer(
                    myToken.nexttoken());
            System.out.println(myBuffer.reverse())+" ");
        }
}//main
}//class
