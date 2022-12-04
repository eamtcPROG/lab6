package Builder;

import Model.HumanModel;

public interface IHumanBuilder {
    HumanBuilder age(int age);
    HumanBuilder name(String name);
    HumanBuilder surname(String surname);
    HumanBuilder rating(int rating);
    HumanModel build();
    void validateHumanObject(HumanModel human);
}
