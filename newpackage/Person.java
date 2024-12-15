package newpackage;

public class Person {

    int id;
    float age;
    String name;

    public void setId(int id){
        this.id = id;
    }
    public void setAge(float age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public float getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
