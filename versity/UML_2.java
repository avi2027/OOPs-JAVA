package versity;

// University
class University{
   public String name;
   public String location;
    
    public University(String name,String location){
        this.name = name;
        this.location = location;
    }
    public void display(){
        System.out.println("University name -> "+name);
        System.out.println("University Location -> "+location);
    }
}
//Canteen
class Canteen{
    public String canteen_name;
    public int no_of_food_item;
    public int no_of_table;
    
    public Canteen(String canteen_name,int no_of_food_item,int no_of_table){
        this.canteen_name = canteen_name;
        this.no_of_food_item = no_of_food_item;
        this.no_of_table = no_of_table;
    }
    public void display(){
        System.out.println("canteen name -> "+canteen_name);
        System.out.println("No of food iteam -> "+no_of_food_item);
        System.out.println("No of table -> "+no_of_table);
    }
}

class DIU extends University {
    public String faculty;
    public String dept;
    public int no_of_student;
    public Canteen can;

    public DIU(String name, String location, String faculty, String dept, int no_of_student) {
        super(name, location);
        this.faculty = faculty;
        this.dept = dept;
        this.no_of_student = no_of_student;
    }

    public void display() {
        super.display();
        System.out.println("Faculty name -> " + faculty);
        System.out.println("Department -> " + dept);
        System.out.println("No_of_students -> " + no_of_student);
    }
}

public class UML_2 {
    public static void main(String[] args) {
        
        
        DIU d = new DIU("DIU", "Asulia", "FIST", "Computer Science", 1000);
        Canteen c = new Canteen("Green Garden",25,20);
        
        d.display();
        c.display();
    }
}
