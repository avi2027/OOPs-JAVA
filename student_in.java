class student{
    String name;
    int age;

    public void student_Info(){
        System.out.println("Student Name:" + this.name);
        System.out.println("Student Age: " + this.age);
    }

    /*
     student(String name, int age){
        this.name = name;
        this.age = age;
    }
     */

    student(student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
    student(){
        
    }
    
}

public class student_in {
    public static void main(String args[]){
        student s1 = new student(); // paramiterized constructor
        
        s1.name = "Avi Mondal";
        s1.age = 24;
         

        student s2 = new student();
        
        s2.name = "Sayed khan";
        s2.age = 23;
        
        

        s1.student_Info();
        s2.student_Info();

    }
}
