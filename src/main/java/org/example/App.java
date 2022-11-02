package org.example;


public class App 
{
    public static void main( String[] args ) {

       Person erik = new Person();
       erik.setFirstname("erik");
       erik.setLastname("sevensson");
       erik.setAge(12);
        System.out.println("this person is " + erik.getFirstName() + " " + erik.getLastname());
        System.out.println(erik.personInformation());
        System.out.println("................................");

        Car volvo = new Car("volvo", "green","f200");
        System.out.println(volvo.getCarInformation());
        volvo.setOwner(erik);
        System.out.println(volvo.getOwnerInformation());
        System.out.println(volvo.getId());



    }
}
