package abstractMethod;

public class Elephant extends Animal{
    Elephant (String name){
        this.name = name;
    }
    @Override
    void run() {
        System.out.println("The elephant " + name +" can run.");
    }
    void canEat(){
        System.out.println("The elephant eat vegetables");
    }
    void howToSleep(){
        System.out.println("Elephant sleep by lying down");
    }
    void reproduction(){
        System.out.println("Elephant reproduction by birth");
    }
    void color(){
        System.out.println("Elephant color is gray");
    }

}
