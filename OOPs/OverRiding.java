package OOPs;

public class OverRiding {
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
    }
    

}

class Animal 
{
    void eat()
    {
        System.out.println("Eats anything ");
    }
}

class Dear extends Animal 
{
    void eat()
    {
        System.out.println("Eats grass ");
    }

}

