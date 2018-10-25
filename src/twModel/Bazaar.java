package twModel;

import java.util.ArrayList;

public class Bazaar extends Block {
    private int bazaarId ;
    Person[] person;
   private int population ;
   private int[] bazaars = new int[15];
   private int bazarId;
   private int bazaarLvl;
  // private ArrayList<Bazaar> bazaars=new ArrayList<>() ;
   private Costs costs = new Costs();

    public Bazaar(int blockId) {
        super(blockId);
    }

    public int getBazaarId() {
        return bazaarId;
    }

    public int getPopulation() {
        return population;
    }

    public int getBazarId() {
        return bazarId;
    }

    public int getBazaarLvl() {
        return bazaarLvl;
    }

    public void add()
   {
      int i = 0 ;
      for (i = 0 ; i<20 ; i++)
      {
            if (bazaars[i] ==0)
                break;
      }

       bazaars[i]= 1 ;
       //capacityOfblocks[i] = 5;
       setBlockId(blockId+1);
       //mojodi-=1000;
   }
   public int bazaarLevel()
   public void remove (int bazaarId)
   {
       bazaars.remove(bazaarId);

   }

    public void setBazaarLvl(int bazaarLvl) {
        this.bazaarLvl = bazaarLvl;
    }

    public void upgrade()
   {
//        numberOfworker+=20;
       costs.setFirstCosts((getLevel()+1)*5000);


   }
   public void cost()
   {

   }
}
