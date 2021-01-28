package com.example.myFirstProject.spring_introduction;

public class Dog implements Pet{
  //  private String name;
    public Dog()
    {
        System.out.println("Dog's bean was created");
    }
    @Override
    public void say()
    {
        System.out.println("Bow-Bow");
    }

  /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public void init(){
        System.out.println("Class dog- init method");
    }
    public void destroy(){
        System.out.println("Class dog- destroy method");
    }
}
