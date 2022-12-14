package polymorphism;

public class Manager extends Employee{
    Manager(String name){
        super(name);
    }
    void sayHello(){
        System.out.println("hello manager "+ this.name);
    }
}
