/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package versity;
import java.util.*;
/**
 *
 * @author avimondal
 */
public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter name,age and salary :  ");
    
        String name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        
        
        System.out.println("Name -> " + name);
        System.out.println("Age -> + age");
        System.out.println("Salary -> " + salary);
        
    }
    
}
