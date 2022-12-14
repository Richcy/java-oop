package abstractMethod;

public class Cat extends Animal{
    Cat (String name){
        this.name = name;
    }
    @Override
    void run() {
        System.out.println("The cat " + name +" can run.");
    }
    void canEat(){
        System.out.println("The cat eat meal");
    }
    void howToSleep(){
        System.out.println("Cat sleep by lying down");
    }
    void reproduction(){
        System.out.println("Cat reproduction by birth");
    }
    void color(){
        System.out.println("Cat color is mostly yellow, black, and white");
    }

}
