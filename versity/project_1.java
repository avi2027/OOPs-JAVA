/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package versity;

/**
 *
 * @author avimondal
 */
public class project_1 {
    public static void main(String[] args) {
        String fruits[] = {"Apple","Mango","orange","banana","jackfruit","watermelon"};
        int price[] = {10,5,7,8,12,9};
        int quantity[] = {5,10,3,8,9,10};
        
        int total = 0;
        for(int i=0; i<6;i++){
            int sum = price[i] * quantity[i];
            total = total + sum;
            System.out.println(fruits[i] +"-> "+sum);
        }
        System.out.println("Total -> " + total);
    }
}
