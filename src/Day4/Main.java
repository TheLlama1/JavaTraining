package Day4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.eat();
        dog.barking();
        cat.meow();
    }

}
