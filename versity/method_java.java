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

public class method_java {
    /* Creating Adding Method */
    public static int add(int a,int b){
        System.out.println("Hello World");
        
        int sum = a + b;
       return sum;        
    } 
    
    /* Creating subtraction Method */
    public static double sub(double x,double y){
        double sum = x - y;
        return sum;
    }
    
    /* Creating multiplication Method */
    public static int mul(int x,int y){
        int sum = x * y;
        return sum;
    }
    
    /* Creating Division Method */
    public static int div(int x,int y){
        int sum = x / y;
        return sum;
    }
    
    /* Main Function */
    public static void main(String[] args) {
        int ans = add(50,50);
        System.out.println("The method addition ->"+ans);
        
        double ans_2 = sub(30.6,12.3);
        System.out.println("The method subtraction ->"+ans_2);
        
        int ans_3 = mul(25,4);
        System.out.println("The method multiplication ->"+ans_3);
        
        int ans_4 = div(100,4);
        System.out.println("The method division ->"+ans_4);
    }
}
