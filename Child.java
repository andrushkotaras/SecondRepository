import java.util.Objects;
public class Child extends SecondRepository {

    static {
        System.out.println("Child 5");
    }
    
    public static int year = fillYear();

    private static int fillYear() {
         System.out.println("Child 6");
        return 20;
    }

    {
        System.out.println("Usual bloc of child cod 10");
    }
    public static int g = gg();
    public static int gg(){
        System.out.println("Child 7");
        return 60;
    }
    int a;
    int b;

    Child (int a, int b){
        this.a = a;
        this.b = b;
    }

    public static int objectMethod(int a, int b){
        int c = a + b;
        System.out.println(c);
        return c;
    }
}
