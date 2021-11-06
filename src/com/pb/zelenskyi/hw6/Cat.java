package com.pb.zelenskyi.hw6;

import java.util.Objects;

public class Cat extends Animal{

    public Cat(String nameAnimal, String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation(" обитает "+location);
    }
    @Override
    public void sleep(){
        System.out.println(getNameAnimal()+" не спит");
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+" мурчит");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" ест "+ getFood());
    }
    @Override
    public String toString() {
        return getNameAnimal() + " бродит по ночам";
    }
    @Override
    public int hashCode(){
        return Objects.hash(getNameAnimal());
    }

    public boolean equals () { return  equals(getNameAnimal());}

}
