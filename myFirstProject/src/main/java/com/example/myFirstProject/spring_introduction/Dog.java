package com.example.myFirstProject.spring_introduction;

public class Dog implements Pet{
    public Dog()
    {
        System.out.println("Dog's bean was created");
    }
    @Override
    public void say()
    {
        System.out.println("Bow-Bow");
    }
}
