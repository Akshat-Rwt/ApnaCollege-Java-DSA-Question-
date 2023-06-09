package OOPs;

public class Inheritance {
    public static void main(String[] args) {
      //  Fish sharks = new Fish();
        //sharks.eat();

        // Multi Level Inheritance 
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4 ;
        System.out.println(dobby.legs); 
    }
}

    class Animal{
        String color ;

        void eat(){
            System.out.println("Eats");

        }

        void breathe()
        {
            System.out.println("Breathe");
        }

    }

    // //Single Level Inheritance 
    // // Derived Class 

    // class Fish extends Animal{
    //     int fins ;

    //     void swim()
    //     {
    //         System.out.println("Swim in water ");
    //     }
    //}

    class Mammuls extends Animal{
        int legs ;

    }
    
    class Dog extends Mammuls{
        String bread ;
    }

    

