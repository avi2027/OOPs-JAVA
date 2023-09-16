/*
 * There are two ways to overload the method in java
 * ->> By changing the number of arguments
 * ->> By changing the data types
 */

public class method_overloading {

    public void sum(int a,int b){
        int c = a + b;
        System.out.println(c);
    }

    public void sum(int x,int y,int z){
        int d = x + y + z;
        System.out.println(d);
    }

    // By changing the data types
    public void sum(double num1, double num2){
        double num3 = num1 + num2;
        System.out.println(num3);

    }
    public static void main(String[] args) {
        method_overloading m = new method_overloading();
        m.sum(50,50);
        m.sum(25,50,25);
        m.sum(25.5,50.3);
    }
}
