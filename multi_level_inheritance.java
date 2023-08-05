import java.util.*;
//import Account;

// Multilevel inheritance
class university{
    String faculty;
}
class faculty extends university{
    String department;
}

class student extends faculty{
    String name;
    int id;

    public void display(){
        System.out.println("Faculty : " + faculty);
        System.out.println("Department : " + department);
        System.out.println("Name : " + name);
        System.out.println("ID: " + id);
    }
}

public class multi_level_inheritance {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        student st = new student();
        

        System.out.print("Enter your Faculty : ");
        st.faculty = input.nextLine();

        System.out.print("Enter your department : ");
        st.department = input.nextLine();

        System.out.print("Enter your name : ");
        st.name = input.nextLine();

        System.out.print("Enter your ID : ");
        st.id = input.nextInt();

        

        printline();
        st.display();
        printline();

    }

    public static void printline(){
        for(int i=1; i<45; i++){
            System.out.print('-');
        }
        System.out.println();
    }
}
