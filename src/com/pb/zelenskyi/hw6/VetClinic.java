package com.pb.zelenskyi.hw6;

public class VetClinic {
    public static void main(String[] args) {
        Animal [] animals = {new Dog("Пес","педигри","в вальере"),
                new Cat("Кот","рыбу","в шкафу"),
                new Horse("Лошадь","траву","на конюшне"),
                new Animal("Курица","комбикорм","на птицефабрике")};

        Veterinarian veterinarian = new Veterinarian();
        for(Animal a:animals){
            veterinarian.treatAnimal(a);
        }


    }


}

