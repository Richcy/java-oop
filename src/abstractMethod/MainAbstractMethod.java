package abstractMethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat("Pussy");
        cat.run();
        cat.canEat();
        cat.howToSleep();
        cat.reproduction();
        cat.color();

        Cat cat1 = new Cat("Catty");
        cat1.run();
        cat1.canEat();
        cat1.howToSleep();
        cat1.reproduction();
        cat1.color();

        Cat cat2 = new Cat("Citty");
        cat2.run();
        cat2.canEat();
        cat2.howToSleep();
        cat2.reproduction();
        cat2.color();

        Horse horse1 = new Horse("Kuda2an");
        horse1.run();
        horse1.canEat();
        horse1.howToSleep();
        horse1.reproduction();
        horse1.color();

        Chicken chicken = new Chicken("Jago");
        chicken.run();
        chicken.canEat();
        chicken.howToSleep();
        chicken.reproduction();
        chicken.color();

        Dog dog = new Dog("Guguk");
        dog.run();
        dog.canEat();
        dog.howToSleep();
        dog.reproduction();
        dog.color();

        Elephant elephant = new Elephant("Gede");
        elephant.run();
        elephant.canEat();
        elephant.howToSleep();
        elephant.reproduction();
        elephant.color();


    }
}
