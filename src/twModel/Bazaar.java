package twModel;
public class Bazaar extends Block {
    private int bazaarId ;
//    Person[] person;
   private int population ;
   private int bazarId;
   private int bazaarLvl;
   private int[] createBazar = new int[20];
   private int[] bazarlevels = new int[20];

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
            if (createBazar[i]==0) {
                createBazar[i] = 1;
                break;
            }
            bazarlevels[bazaarId]=5;
      }


   }
   public void remove ()
   {

   }
   public void upgrade(int bazaarId)
   {
       bazarlevels[bazarId]+=1;
       setBazaarLvl(bazarlevels[bazarId]);

   }

    public void setBazaarId(int bazaarId) {
        this.bazaarId = bazaarId;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setBazarId(int bazarId) {
        this.bazarId = bazarId;
    }

    public void setBazaarLvl(int bazaarLvl) {
        this.bazaarLvl = bazaarLvl;
    }

    public void setCreateBazar(int[] createBazar) {
        this.createBazar = createBazar;
    }

    public void cost()
   {

   }

}
