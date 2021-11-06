package com.pb.zelenskyi.hw6;

import com.pb.zelenskyi.hw5.Book;

public class Veterinarian {
    public Veterinarian() {
    }

    public void treatAnimal (Animal  animal){
        System.out.println(animal.getNameAnimal()+ " "+animal.getLocation());
        animal.makeNoise();
        animal.sleep();
        animal.eat();
        System.out.println("toString : " + animal.toString());
        System.out.println("hashCode : " + animal.hashCode());
        System.out.println("equals : " + animal.equals(animal));


    }

}
