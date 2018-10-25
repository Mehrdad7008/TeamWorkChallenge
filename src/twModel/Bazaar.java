package twModel;

public class Bazaar extends Block {
    private int bazaarId ;
    Person[] person;
   private int population ;
   private int bazarId;
   private int bazaarLvl;
   private int[] createBazar = new int[20];

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
                createBazar[i] = 1;
      }
   }
   public void remove ()
   {

   }
   public void upgrade()
   {

   }
   public void cost()
   {

   }
}
