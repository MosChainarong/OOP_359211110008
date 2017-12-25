package ooplab6;

public class myStrBuffer {
    public static void main(String[] args) {
        //Stringbuffer
        StringBffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);
        buffer.replace(Start:0, end:5, str: "University");
        System.out.println(buffer);
        System.out.println(buffer.reverse());
        buffer.setCharat(index:0, ch: "T");
}//main
}//class
