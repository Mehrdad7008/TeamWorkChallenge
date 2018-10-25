package twModel;

public class Defense {
  private   float defenseLevel;
  private int numberOfDefense = 0;

    public float getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(float defenseLevel) {
        this.defenseLevel = defenseLevel;
    }
    void add()
    {
        nonworker -=30;
        defenseLevel = 0.2;
    }
    void remove ()
    {
        nonworker +=30;
        numberOfDefense -=30;

    }
    void upgrade ()
    {
        setDefenseLevel(level+0.2);
    }
}

