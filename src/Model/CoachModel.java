package Model;

import Builder.HumanBuilder;

public class CoachModel extends HumanModel{
    public int experince;

    public CoachModel(HumanBuilder builder,int experince) {
        super(builder);
        this.experince = experince;
    }
}
