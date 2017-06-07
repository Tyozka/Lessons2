package Lessons8;

public class Otlichnik extends MyStudent {

    public Otlichnik(int id , String surname){
        super(id, surname); // Всегда вначале нужно
    }

    public String greet(){return "Hi "+ this.getSurname();}

    public String getGramot(){
        return "Thanks";
    }

}
