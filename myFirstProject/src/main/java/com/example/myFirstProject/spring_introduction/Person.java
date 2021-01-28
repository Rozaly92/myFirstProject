package com.example.myFirstProject.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;
    public Person(Pet pet)
    {
        this.pet=pet;
    }
    public Person()
    {
        System.out.println("Person bean is created!");
    }
    public void callYourPet(){
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }
    public void setPet(Pet pet)
    {
        System.out.println("Class person: set Pet");
        this.pet=pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
