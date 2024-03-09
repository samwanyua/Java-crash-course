class Chef{
    public String name;
    public int age;

    //constuctor
    public Chef(String name,int age ){
        this.name = name;
        this.age = age;
    }

    public void makeChicken(){
        System.out.println("The chef makes chicken");
    }

    public void makeSalad(){
        System.out.println("The chef makes salad");
    }

    public void makesSpecialDish(){
        System.out.println("The chef makes a special dish");
    }
};

class ItalianChef extends Chef{
    public String originCountry;
    
    //Constructor
    public ItalianChef(String name, int age, String originCountry){
        super(name, age); //calling superclass constructor
        this.originCountry = originCountry;
    }
    public void makePasta(){
        System.out.println("The chef makes pasta");
    }

    @Override
    public void makesSpecialDish(){
        System.out.println("The chef makes chicken parm");
    }
}
public class Const {
    public static void main(String [] args){
        Chef chef1 = new Chef("Kelvin", 35);
        chef1.makeChicken();


        ItalianChef chef2 = new ItalianChef("Chaiwin", 32, "Russia");
        System.out.println(chef2.age);
    }
}
