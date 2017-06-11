package Lessons8;


import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) {


        Student student = new Student("Ivan", "Petrov", new int[]{ 2, 4, 5, 6});

        System.out.println(student.getName() + " lost");
        student = new Student("Petr", "Petrov");
        logStudent(student);


        MyStudent studentMy = new MyStudent(5, "Petrove");
        studentMy.test();

        BigDecimal bigDecimal = new BigDecimal("1000.12");
        BigDecimal bigDecima2 = new BigDecimal("10.447");
        BigDecimal bigDecima3 = bigDecimal.add(bigDecima2);
        System.out.println(bigDecima3);

        Logger log = new Logger();


        log.logPersone(studentMy);


        Otlichnik otl = new Otlichnik(6, "Velev");
        log.logPersone(otl);

        MyStudent student2 = otl; // new MyStudent(-100, "Petrovich");
        System.out.println(otl.getGramot());

        Otlichnik otlichnik2 = (Otlichnik)student2; // закостовать, не нужно делать!

        if(student2 instanceof Otlichnik){
            System.out.println("yessss");
        } else {
            System.out.println("nooo");
        }
//        System.out.println(otlichnik2.getGramot());

    }

    public static void logStudent(int index, Student student){
        index++;
        student.setLastName(student.getLastName()+".");

        System.out.println(index + " " + student.getName() + " ");
        System.out.println(student.getLastName() + " ");
    }

    public static void logStudent( Student student){

        student.setLastName(student.getLastName());

        System.out.println(student.getName() + " ");
        System.out.println(student.getLastName() + " ");
    }
}
