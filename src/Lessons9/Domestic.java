package Lessons9;

/**
 * Created by User on 11.06.2017.
 */
public abstract class Domestic extends Animal {

    public Domestic(int id, int age,double weight, String color, String name,boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    private String name;
    private boolean isVactinated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVactinated() {
        return isVactinated;
    }

    public void setIsVactinated(boolean isVactinated) {
        this.isVactinated = isVactinated;
    }
    public String getVoice(){
        String result = super.getVoice();
        result += "my name is ";
        result += name;
        return result;
    }
}