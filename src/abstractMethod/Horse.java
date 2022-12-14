package abstractMethod;

public class Horse extends Animal{
    public Horse(String name){
        this.name = name;
    }
    @Override
    void run() {
        System.out.println("The Horse " + name + ", can run");
    }
    void canEat(){
        System.out.println("Horse can eat bamboo");
    }
    void howToSleep(){
        System.out.println("Horse sleep by standing");
    }
    void reproduction(){
        System.out.println("Horse reproduction by birth");
    }
    void color(){
        System.out.println("Horse color is mostly brown");
    }
}
