import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class syntax {
    public static void main(String[] args){
        
        // Static Arrays
        int[] a = new int[2];
        a[0]=1;
        a[1]=2;

        //Dynamic Arrays
        ArrayList<Integer>l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.set(0,3);
        System.out.println(l.get(0));

        //Maps
        HashMap<Integer,Integer>m = new HashMap<>();
        m.put(1, 5);
        System.out.println(m.get(1));
    }
}