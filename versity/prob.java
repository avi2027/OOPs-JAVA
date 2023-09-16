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
public class prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        if(num < 0){
            System.out.println("Invalid output");
        }
        else{
            for(int i=1; i<=num; i++){
                if(i % 2 != 0){
                    System.out.print(" " + i);
                }               
            }
        }
                      
    }
}
