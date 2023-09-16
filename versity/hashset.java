package versity;
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //Insert
        set.add("Avi");
        set.add("Sayed");
        set.add("Avi");
        set.add("Joe");
        set.add("Bob");
        set.add("Adon");
        
        System.out.println(set);

        //contains(search)

        /*
         
         f(set.contains("Sayed")){
            System.out.println("set contains Sayed");
        }
        if(!set.contains("Rajesh")){
            System.out.println("set does not contains");
        }
         */
        

        //remove
        set.remove("Avi");
        if(!set.contains("Avi")){
            System.out.println("Avi does not exit");
        }

        System.out.println(set);

        //iterate
        Iterator<String> it = set.iterator();
        //has next   // next

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
