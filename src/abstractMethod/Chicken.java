package abstractMethod;

public class Chicken extends Animal{
    Chicken (String name){
        this.name = name;
    }
    @Override
    void run() {
        System.out.println("The chicken " + name +" can run.");
    }
    void canEat(){
        System.out.println("The chicken eat worm");
    }
    void howToSleep(){
        System.out.println("Chicken sleep by sitting down");
    }
    void reproduction(){
        System.out.println("Chicken reproduction by egg");
    }
    void color(){
        System.out.println("Chicken color is mostly black");
    }

}
