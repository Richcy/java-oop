package abstractMethod;

public class Dog extends Animal{
    Dog (String name){
        this.name = name;
    }
    @Override
    void run() {
        System.out.println("The dog " + name +" can run.");
    }
    void canEat(){
        System.out.println("The dog eat meal");
    }
    void howToSleep(){
        System.out.println("Dog sleep by lying down");
    }
    void reproduction(){
        System.out.println("Dog reproduction by birth");
    }
    void color(){
        System.out.println("Dog color is mostly yellow, black, and white");
    }

}
