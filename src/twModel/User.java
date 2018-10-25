package twModel;

import java.util.ArrayList;

public class User {
    public int i = 0;
    private Block myBlock = new Block(i);
    int a;
    private ArrayList <Block> blocks = new ArrayList<>();
    private double score = 0.00;

    public Bazaar myBazaar = new Bazaar(a);
    public Home myHome = new Home(a);

    public void setMyBazaar(int a) {
        this.myBazaar.blockId = a;
    }

    public int getMyBazaarId() {
        return this.myBazaar.blockId;
    }

    public void setMyHomeId(int a) {
        this.myHome.blockId = a;
    }

    public int getMyHomeId() {
        return this.myHome.blockId;
    }

    public int userBlockId() {
        this.myBlock.add((i+1)%2);
        return this.myBlock.getBlockId();
    }
}