// Abstract classes and attributes
//Abstract classes -> the subclasses should implement specific method
abstract class vehicles{
    public abstract void move(); //THis is an abstract method
    public void getDescription(){
        System.out.println("Vehicles are used for transportation");
    }
}

class Bicycle extends vehicles{
    @Override
    public void move(){
        System.out.println("The bicycle pedals forward");
    }
}

class Planes extends vehicles{
    public void move(){
        System.out.println("The plane flies through the sky");
    }
}

public class Abstract_classes {
    public static void main(String [] args){
        Planes boeing = new Planes();
        boeing.move();
        boeing.getDescription();
    }
}
