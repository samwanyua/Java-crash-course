// Interface inheritance
interface Animal{
    public void speak(); //abstract class

}

class Cat implements Animal{
    @Override
    public void speak(){
        System.out.println("Meow! Meow!");
    }
}

class Dog implements Animal{
    @Override
    public void speak(){
        System.out.println("Woof! Woof!");
    }
}


public class Polymorphism {
    public static void main(String [] args){
        Animal animals []  ={
            new Dog(),
            new Cat()
        };
        for(Animal animal : animals){
            animal.speak();
        }
    }
}
