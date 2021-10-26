package adbistju.system;

import adbistju.system.models.Animal;
import adbistju.system.models.Cat;
import adbistju.system.models.Dog;
import adbistju.system.models.Mouse;

public class Main {
    public static void main(String[] args){
        Animal[] animals = {new Cat(), new Dog(), new Mouse()};

        for (Animal a: animals) {
            a.toEat();
            a.toEat();
            a.toSleep();
            a.toEat();
            a.run();
            a.run();
            a.toSleep();
            a.toSleep();
            System.out.println(a.voice());
            System.out.println("--------");
        }
    }
}
