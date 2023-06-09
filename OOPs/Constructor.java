package OOPs;
 public class Constructor {
        public static void main(String[] args) {
        //Student s = new Student();
        // System.out.println(s.name);
        //Student s1= new Student("Akshat rawat");
        //System.out.println(s1.name );
        //Student s2= new Student(10);

        //copy constructor 
        Student s1  = new Student();
        s1.name ="Akshat ";
        s1.rollno = 8;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 100;
        s1.marks[3] = 100;

        Student s2 = new Student(s1);
        s2.password = "efgh";
        //s1.marks[2] = 90;
        for(int  i = 0 ; i< 3 ; i ++){
            System.out.println(s2.marks[i]);
        }
        
    
        }
    }
    
        class Student{
            String name ;
            int rollno;
            String password;
            int marks[];
    
            //ShallowCopy constructor 
            Student (Student s1){
                marks = new int[3];
                this.name = s1.name;
                this.rollno = s1.rollno;
                this.marks = s1.marks;
                

                
            }

            // Non parameterized constructor 
            Student(){
                marks = new int[3];
                System.out.println("Constructor is called.....");
            }

            // parameterized constructor

            Student(String name ){
                marks = new int[3];
                this.name = name ;
            }

            Student (int rollno){
                marks = new int[3];
                this.rollno = rollno;
            }
        }
    

