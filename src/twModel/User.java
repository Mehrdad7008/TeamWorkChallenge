package twModel;

import java.util.ArrayList;

public class User {
    private ArrayList<Block> blocks = new ArrayList<>();

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }
    static int maxBlockId (ArrayList<Block> blocks){
        int max =0;
        for(Block temp:block)
        {
            max=Math.max(max,temp.getBlockId());
        }
        return max;
    }
}