package Lessons8;

public class Student {
    private String firstName;
    private String lastName;
    private int[] marks;


    //  конструктор по умолчанию
    public Student(){
    }

    // конструктор
    public Student(String firstName, String lastName){
        this(firstName, lastName, new int[32] ); // вызов конструктора
    }

    // конструктор
    public Student(String firstName, String lastName, int[] marks){
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public void greet(){
        System.out.println("Hello, my name is " + this.firstName);
    }

    public void setFirstName(String name){
        if(name != null){
            this.firstName = name;
        }
    }


    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
