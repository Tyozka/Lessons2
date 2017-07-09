package Lessons8;

public class MyStudent extends Person {



    public MyStudent (int id , String surname){
        super(id, surname); // Всегда вначале нужно
    }

    public void test(){
        System.out.println(this.getId());
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String greet(){
        return "Hello, My name is - " + getSurname();
    }

   //todo реализовать equals и hashCode

}
