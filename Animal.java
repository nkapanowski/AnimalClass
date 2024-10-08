public class Animal {
    // Fields
    public int age;
    public String gender;

    // Methods
    public void isMammal() {
        System.out.println("This is a public method isMammal() from the Animal class");
    }

    public void mate() {
        System.out.println("This is a public method mate() from the Animal class");
    }

    // Main
    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        // Call methods from Animal class
        myAnimal.isMammal();
        myAnimal.mate();

        // Call methods from Zebra class
        myZebra.isMammal(); // From Animal
        myZebra.mate();     // From Animal
        myZebra.run();

        myFish.tryToEat();
    }
}

// Subclass of Animal
class Fish extends Animal {
    
    private int sizeInFeet;

    public Fish() {
        this.sizeInFeet = 2;
    }

    private void canEat() {
        System.out.println("This is a private method canEat() from the Fish class");
    }
    public void tryToEat() {
        System.out.println("The fish of size " + sizeInFeet + " feet is trying to eat.");
        canEat(); // Call private method
    }
    }


// Subclass of Animal
class Zebra extends Animal {
    
    public boolean is_wild;

    public void run() {
        System.out.println("This is a public method run() from the Zebra class");
    }
}

