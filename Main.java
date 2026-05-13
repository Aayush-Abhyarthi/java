import java.util.Scanner;
import java.util.ArrayList;
import packages.*;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n;
        System.out.println("Enter the value of n");
        n = scanner.nextInt();

        ArrayList<car>v = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            int rno;
            String ms;
            System.out.println("Enter the value of rno and ms");
            rno = scanner.nextInt();
            ms = scanner.next();

            car c = new car();
            c.setRno(rno);
            c.setMs(ms);

            v.add(c);
        }

        for(int i=0;i<n;i++){
            System.out.println("For car " + i+1 + " the rno is " + v.get(i).getRno() + "and ms is " + v.get(i).getMs());
        }
    }
}
