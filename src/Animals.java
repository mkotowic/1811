public class Animals {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Animal();
        animals[4] = new Bird ("Flash");
        animals[5] = new Fish("Posejdon");

        for (Animal animal : animals) {
            animal.introduce();
        }
    }
}


class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierzę: " + name;
    }

    String makeSound () {
        return "???";
    }

    void introduce(){
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}
class Dog extends Animal {
    public Dog (String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}
class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }
}
class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Swinka " + name;
    }

    @Override
    String makeSound() {
        return "chrum chrum";
    }
}

class Bird extends Animal {
    public Bird(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Ptak " + name;
    }

    @Override
    String makeSound() {
        return "śpiew";
    }
}
class Fish extends Animal {
    public Fish(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Ryba " + name;
    }

    @Override
    String makeSound() {
        return "ooo";
    }
}