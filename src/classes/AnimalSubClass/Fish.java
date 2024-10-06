package classes.AnimalSubClass;

public class Fish {
    private int sizeInFeet;
    
    public Fish(int sizeInFeet){
        this.sizeInFeet = sizeInFeet;
        canEat();
    }

    private static boolean canEat(){
        System.out.println("Called private static boolean canEat() method in Fish class");
        return true;
    }
}

