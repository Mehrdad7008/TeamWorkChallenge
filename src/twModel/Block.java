package twModel;

public class Block {
    protected int blockId = 0;
    protected int level = 1;
    protected boolean validArmy;
    protected int nonWorker;
    protected int worker;
    protected int[] blockCreate = new int[15];
    private int capacity = 5;
    private int[] capacityOfblocks = new int[15];
    private int[] levelOfblocks = new int[15];

    public Block(int blockId) {
        this.blockId = blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setValidArmy(boolean validArmy) {
        this.validArmy = validArmy;
    }

    public void setNonWorker(int nonWorker) {
        this.nonWorker = nonWorker;
    }

    public void setWorker(int worker) {
        this.worker = worker;
    }

    public int getBlockId() {
        return blockId;
    }

    public int getLevel() {
        return level;
    }

    public boolean isValidArmy() {
        return validArmy;
    }

    public int getNonWorker() {
        return nonWorker;
    }

    public int getWorker() {
        return worker;
    }

    public void add(int constant) {
        int i;
        for (i = 0; i < 15; i++) {
            if (blockCreate[i] == 0)
                break;
        }
        blockCreate[i] = 1;
        capacityOfblocks[i] = 5;
        setBlockId(blockId + constant);
//        mojodi-=1000;
    }

    public void remove(int blockId) {
        blockCreate[blockId - 1] = 0;
//        mojodi+=500;

    }

    public void upgrade(int blockId) {

        capacityOfblocks[blockId] += 5;
        levelOfblocks[blockId]++;
//        mojodi-=math.abs(500,levelOfblocks[blockId])

    }

    //    public int cost()
//    {
//
//    }
    public void attack() {


    }

    public void loot() {

    }

    public void score() {

    }

    public void grill() {

    }
}
