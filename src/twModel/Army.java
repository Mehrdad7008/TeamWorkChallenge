package twModel;

public class Army
{
    private float armyLevel;
    private boolean validArmy = true;

    public float getArmyLevel() {
        return armyLevel;
    }
    0

    public void setArmyLevel(float armyLevel) {
        this.armyLevel = armyLevel;
    }
    public void add()
    {
        nonworker-=100;

        validArmy = false;
    }
    public void remove()
    {
        nonworker+=100;
        validArmy = true;

    }
    public void upgade()
    {
        nonworker-=10;
    }
    public void attack()
    {

    }

}
