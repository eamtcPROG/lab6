package Model;

import Builder.HumanBuilder;

public class HumanModel {
    public String name;
    public String surname;
    public int age;
    public float rating;
    public HumanModel(HumanBuilder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.rating = builder.rating;
    }
}
