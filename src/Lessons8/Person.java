package Lessons8;


public abstract class Person{
    private int id;
    private String surname;



    public Person(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    protected String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public abstract String greet();
}
