package Method;
import Extra.*;
class Person{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Test{
    String model;
    void display(){
        System.out.println("This is a "+ model);
    }

}

class Vehicle{
    protected int speed; // Protected Member
}
class Bike extends Vehicle{
    void setSpeed(int s){
        speed = s;
    }
    int getSpeed(){
        return speed;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Sayani");
        System.out.println(p.getName());
        // p.setName("Sayani");
        Test t = new Test();
        t.model = "BMW";
        System.out.println(t.model);
        t.display();
        UtilityPackage up = new UtilityPackage();
        up.name = "Toyota";
        up.display();
        Extra ex = new Extra();
        // ex.name = "Honda";
        // ex.display();
        ex.display2();
    }
}
