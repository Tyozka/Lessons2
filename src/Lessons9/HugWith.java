package Lessons9;

import Lessons8.Person;

public class HugWith{


    public void makeHug(Person person, Purrable purrable){

        purrable.purr();
        System.out.println( person.greet());

    }
}
