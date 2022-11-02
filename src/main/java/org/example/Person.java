package org.example;

public class Person {
    private String firstName;
    private String lastname;
    private int age;
    private boolean sleeping;

    public Person(){
        this.sleeping = false;
    }

    public Person(String firsName, String lastName, int age){
        this(firsName,lastName);
        setAge(age);

    }

    public Person( String firstName, String lastname){
        this();
        setFirstname(firstName);
        setLastname(lastname);
    }
    public Person(String firsName, String lastName, int age, boolean sleeping) {
        this(firsName, lastName);
        setAge(age);
    }

    public void setFirstname(String firstName){
        if(firstName == null) throw new IllegalArgumentException("firsName param is null");
        this.firstName = firstName;

    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastname( String lastname){
        if(lastname == null) throw new IllegalArgumentException("lastName param was null");
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setAge(int age){
        this.age = age;

    }

    public int getAge(){
        return age;
    }
    public void setSleeping(boolean sleeping){
        this.sleeping = sleeping;

    }
    public boolean isSleeping(){
        return sleeping;

    }

    public String personInformation(){
        return "person : firstName: " + firstName+ "Last name" + lastname + "Age" + age;
    }





}
