// polymorphism 
package versity;
//import java.util.*;
class vehicle{
    public void v1(){
        System.out.println("Vehicle use for transport");
    }
}
class car extends vehicle{
    public void v1(){
        System.out.println("Car is a vehicle");
    }
}
class bike extends vehicle{
    public void v1(){
        System.out.println("Bike is a also vehicle");
    }
}
public class avi_12 {
    public static void main(String[] args) {
        vehicle vehicle1 = new vehicle();
        vehicle car1 = new car();
        vehicle bike1 = new bike();
        
        vehicle1.v1();
        car1.v1();
        bike1.v1();
        
    }
    
}
