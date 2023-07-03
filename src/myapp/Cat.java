package myapp;

import java.util.ArrayList;

public class Cat {
    String name;
    int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
        age = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
}
