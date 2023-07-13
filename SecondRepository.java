import java.util.Objects;
public class SecondRepository {
    public static void main(String[] args) {
        System.out.println("main 8");
        Child object = new Child( 7, 8);

        // Дз №13
        Students medStudent = new MedicalStudents("m", 5555);
        medStudent.getYearsOfStudy();
        Students dentStudent = new DentalStudents("f", 7777);
        dentStudent.fullInfo();
        Teachers teacher = new Professor("Rostyslav", "Histology");
        teacher.getScientificDegree();
        teacher.fullInfo();
        Teachers teacher2 = new Docent("Oleg", "Anatomy");
        teacher2.fullInfo();

    }
    {
        System.out.println("Usual bloc of parent cod 9");
    }

    static {
        System.out.println("Parent 1");
    }

    static {
        System.out.println("Parent 2");
    }
    public static int pm = parentMethod();

    private static int parentMethod(){
        System.out.println("Parent 3");
        return 30;
    }
    static {
        System.out.println("Parent 4");
    }

}
