
package versity;
//import java.util.*;

class teacher{
    private String name;
    private int ID;
    private String gender;
    private int phone;
    
   public void teacherInfo(String name,int ID,String gender,int phone){
       this.name = name;
       this.ID = ID;
       this.gender = gender;
       this.phone = phone;
   }
   
   public void display(){
       System.out.println("Name ->"+name);
       System.out.println("ID ->"+ID);
       System.out.println("Gender ->"+gender);
       System.out.println("Phone ->"+phone);
       System.out.println();
   }
}

public class UML {
    public static void main(String[] args) {
        //new object
        teacher tea1 = new teacher();
        tea1.teacherInfo("Joe",1558,"male",6345686);
        
        teacher tea2 = new teacher();        
        tea2.teacherInfo("Disel",5367,"male",576438756);
        
        teacher tea3 = new teacher();        
        tea3.teacherInfo("Avi",6797,"male",7588756);
        
        tea1.display();
        tea2.display();
        tea3.display();
        
    }
}
