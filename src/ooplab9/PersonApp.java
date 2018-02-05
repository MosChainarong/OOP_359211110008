package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Chainarong","123456789",
                new Address("147/32 M.6","SuratThani","84000"),
                new Job("Staff","20000"));


        System.out.println(person.toString());

        person.getJob().setsalary("30000");
        System.out.println( person.getJob());

        person.getJob().setposition("Stder");
        System.out.println( person.getJob());

    }//main

}//class