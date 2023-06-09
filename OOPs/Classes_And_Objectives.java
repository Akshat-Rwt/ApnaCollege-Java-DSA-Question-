package OOPs;

public class Classes_And_Objectives {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor ("Blue");
        System.out.println(p1.color);

        p1.setTip(3);
        System.out.println(p1.tip);

        p1.color = "Yellow";
        System.out.println(p1.color);


    }
    
}

class Pen{

    // Properities and Functions

    String color ;
    int tip ;

    void setColor (String newColor){
        color = newColor ;

    }

    void setTip (int newTip){
        tip = newTip ;
        
    }
}

class Student {

    String name  ;
    float percentage ;
    int age ;

    void calculatePercenatge (int phys , int maths , int eng){
        percentage = (phys + maths + eng) / 3;
    }
}
