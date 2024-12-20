

import java.util.Scanner;
import java.util.ArrayList;

import newpackage.Person;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n = scanner.nextInt();
        
        ArrayList<Person> v = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int id;
            float age;
            String name;
            System.out.println("Enter the person " + (i+1));
            id = scanner.nextInt();
            age = scanner.nextFloat();
            name = scanner.next();

            Person p = new Person();
            p.setId(id);
            p.setAge(age);
            p.setName(name);
            v.add(p);
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("The value of person " + (i+1) + " is ");
            System.out.println(v.get(i).getId() + " " + v.get(i).getAge() + " " + v.get(i).getName());
        }

    }
}