import bank.student;
import bank.university;

class university{
    String department;
}
class student extends university{
    String name;
    int ID;

    public void display(){       
        System.out.println("Department: " + department);
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        
    }
}

public class inheritance {
    public static void main(String[] args){
        student s = new student();
        s.department = "CSE";
        s.name = "Avi Mondal";
        s.ID = 1558;

        printline();
        s.display();
        printline();
        
    }

    public static void printline(){
        int i;
        for(i=1; i<40; i++){
            System.out.print('-');
        }
        System.out.println();
    }
    
}
