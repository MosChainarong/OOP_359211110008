package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Chainarong","123456789",
                new Address("147/32 M.6","SuratThani","84000"),
                new Job("Staff","20000"));


        System.out.println(person.toString());

    }//main

}//class