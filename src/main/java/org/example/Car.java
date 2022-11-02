package org.example;

public class Car {

    public static int sequencer = 1000;

    //field
    private int id;
    private String brand;
    private String color;
    private  String model;
    private int year;

    private Person owner;

    //constructor

    public Car(){
        this.year = 2022;
        this.id = ++sequencer;

    }

    public Car(String brand, String color, String model){
        this();
        setBrand(brand);
        this.brand = brand;
        this.color = color;
        this.model = model;

    }
    public Car(String brand, String color, String model, int year){
        this.id = ++sequencer;
        setBrand(brand);
        this.color = color;
        this.model = model;
        this.year = year;

    }

    //method
    public String getCarInformation(){
        return "car ID : " + id + " car brand : " + brand + " model: " + model + " year : " + year;
    }

    public String getOwnerInformation(){
        if(owner!= null){
            return owner.personInformation();
        }else{
            return null;
        }

    }



    //getter and setter

    public int getId(){
        return id;
    }

    public void setOwner(Person owner){
        this.owner = owner;
    }

    public Person getOwner(){
        return owner;

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null) throw new IllegalArgumentException("brand param was null");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
