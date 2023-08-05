class pen{
    String color;

    public void printcolor(){
        System.out.println("The color of the pen is "+ this.color);
    }
}


public class penfo {
    public static void main(String[] args){
        pen p1 = new pen();
        p1.color="red";

        pen p2 = new pen();
        p2.color ="blue";

        pen p3 = new pen();
        p3.color= "green";

        p1.printcolor();
        p2.printcolor();
        p3.printcolor();
    }
}
