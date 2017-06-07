package Lessons8;

public class Teacher extends Person {
    private int salary;

    public Teacher(int id, String surname, int salary){
        super(id,surname);
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String greet() {
        return "Hi? I'm Teacher";
    }
}
