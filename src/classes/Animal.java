package classes;
import classes.AnimalSubClass.Fish;
import classes.AnimalSubClass.Zebra;

public class Animal {
    public int age;
    public String gender;


    public boolean isMammal() {
        System.out.println("Called public boolean isMammal() method in Animal class");
        return true;
        
    }

    public boolean mate() {
        System.out.println("Called public boolean mate() method in Animal class");
        return true;
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish(2);
        Zebra myZebra = new Zebra(true);

        myAnimal.mate();
        myAnimal.isMammal();
        myZebra.run();

    }
}
