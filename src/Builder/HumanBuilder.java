package Builder;

import Model.HumanModel;

public class HumanBuilder implements IHumanBuilder{
    public String name;
    public String surname;
    public int age;
    public float rating;

    @Override
    public HumanBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public HumanBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public HumanBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public HumanBuilder rating(int rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public HumanModel build() {
        HumanModel human = new HumanModel(this);
        validateHumanObject(human);
        return human;
    }

    @Override
    public void validateHumanObject(HumanModel human) {
        if(human.name == null){
            human.name = "";
        }
        if(human.surname == null){
            human.surname = "";
        }
        if(human.age == 0){
            human.age = 18;
        }
        if(human.rating == 0){
            human.rating = 50;
        }
    }
}
