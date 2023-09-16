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
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        
        if(year % 400 == 0){
            System.out.println("This year Leap year");
        }
        else if(year % 4 == 0){
            System.out.println("This year Leap year");
        }
        else if(year % 100 == 0){
            System.out.println("This year is not Leap year");
        }
        else{
            System.out.println("This year not Leap year");
        }
    }
}
