package Lessons8;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Ivan", "Petrov", new int[]{ 2, 4, 5, 6});


        student = new Student("Petr", "Petrov");
        logStudent(student);




        int ivanovsIndex = 1;
        logStudent(ivanovsIndex, student);

        System.out.println();
        System.out.println(student.getLastName());
        System.out.println(ivanovsIndex);




    }

    public static void logStudent(int index, Student student){
        index++;
        student.setLastName(student.getLastName()+".");

        System.out.println(index + " " + student.getName() + " ");
        System.out.println(student.getLastName() + " ");
    }

    public static void logStudent( Student student){

        student.setLastName(student.getLastName()+".");

        System.out.println(student.getName() + " ");
        System.out.println(student.getLastName() + " ");
    }
}
