class Chef{
    public void makeChicken(){
        System.out.println("The chef makes chicken");
    }

    public void makeSalad(){
        System.out.println("The chef makes salad");
    }

    public void makesSpecialDish(){
        System.out.println("The chef makes a special dish");
    }
}

class ItalianChef extends Chef{
    public void makePasta(){
        System.out.println("The chef makes pasta");
    }

    @Override
    public void makesSpecialDish(){
        System.out.println("The chef makes chicken parm");
    }
}

public class Inheritance {
    public static void main(String [] args){
        Chef myChef = new Chef();
        myChef.makeChicken();
        myChef.makesSpecialDish();

        ItalianChef myItalianChef = new ItalianChef();
        myItalianChef.makeChicken();
        myItalianChef.makesSpecialDish();
    }
}
