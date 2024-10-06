package classes.AnimalSubClass;

public class Zebra {
    public boolean is_wild;

    public Zebra(boolean is_wild){
        this.is_wild = is_wild;
    }

    public void run(){
        System.out.println("Called public void run() method in Zebra class");
    }
}
