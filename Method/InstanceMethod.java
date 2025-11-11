package Method;

public class InstanceMethod {
    String name;
    public void displayName(String name){
        this.name = name;

    }
    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();
        obj.displayName("Dear Sayani");
        System.out.println(obj.name);
    }
}
