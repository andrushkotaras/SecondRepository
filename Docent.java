public class Docent extends Teachers {

    Docent (String name, String subject){
        this.name = name;
        this.subject = subject;
    }


    public  void getName(){
        System.out.println(name);
    }
    public  void getSubject(){
        System.out.println(subject);
    }
    public void getScientificDegree(){
        System.out.println(name + "'s scientific degree is Docent");
    }

    @Override
    public void fullInfo() {
        getName();
        getSubject();
        getScientificDegree();
    }
}
