package twModel;

import java.util.ArrayList;

public class User {
//    private ArrayList<Block> blocks = new ArrayList<>();
//////
//////    public ArrayList<Block> getBlocks() {
//////        return blocks;
//////    }
//////
//////    public void setBlocks(ArrayList<Block> blocks) {
//////        this.blocks = blocks;
//////    }
//////    static int maxBlockId (){
//////        ArrayList<Block> blocks=new ArrayList<>();
//////        int max =0;
//////        for(Block temp:blocks)
//////        {
//////            max=Math.max(max,temp.getBlockId());
//////        }
//////        return max;
//////    }
    private int i=0;
    private Block myBlock = new Block(i);
//    public User(){
//        this.myBlock.add();
//    }
    public void userId(){
        this.myBlock.add();
        i++;
        System.out.println(this.myBlock.getBlockId());
    }
}