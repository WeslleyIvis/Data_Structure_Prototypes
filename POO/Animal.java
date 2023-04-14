public class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Uma mensagem genérica de som do animal");
    }
}

class Mammal extends Animal {
    private String fur_type;
    private String specie;

    Mammal(String name, int age, String fur, String specie) {
        super(name, age);
        this.fur_type = fur;
        this.specie = specie;
    }

    public void breastfeeding() {
        System.out.println("Amamentando");
    }
}

class Dog extends Mammal {
    private String breed;
    private String color;

    Dog(String name, int age, String fur, String specie, String breed, String color) {
        super(name, age, fur, specie);
        this.breed = breed;
        this.color = color;
    }

    public void bark() {
        System.out.println("rHow rhow");
    }
}