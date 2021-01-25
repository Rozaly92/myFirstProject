package com.example.myFirstProject.spring_introduction;

public class Cat implements Pet{
    public Cat()
    {
        System.out.println("cat's bean was created");
    }
    @Override
    public void say()
    {
        System.out.println("Meow-Meow");
    }
}
