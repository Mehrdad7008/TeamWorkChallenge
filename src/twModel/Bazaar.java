package twModel;

public class Bazaar extends Block {
    private int bazaarId ;
    Person[] person;
   private int population ;
   private int bazarId;
   private int bazaarLvl;
   private int[] createBazar = new int[20];
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
            if (createBazar[i]==0)
                break;
      }
       blockCreate[i] = 1 ;
       //capacityOfblocks[i] = 5;
       setBlockId(blockId+1);
       //mojodi-=1000;
   }
   public void remove (int bazaarId)
   {
       createBazar[bazaarId] = 0;

   }
   public void upgrade()
   {
        numberOfworker+=20;
       costs.setFirstCosts((getLevel()+1)*5000);

   }
   public void cost()
   {

   }
}
