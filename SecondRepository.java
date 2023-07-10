public class SecondRepository {
    public static void main(String[] args) {
        {
            System.out.println("Parent main 1");
        }
    }

    static {
        System.out.println("Parent static ..");
    }
    {
        System.out.println("dssd");
    }

}
