
public class Home extends Block {
	private Floor[] floor = new Floor[100000];
	private int point;
	private float e=10;
	private int homeId = 0 ;
	private int cost = 3000 ;
	private int[] home = new int[15] ;
	protected int[] homeCreate = new int[15];
    
	public void setHomeId(int homeId) {
        this.homeId = homeId;
    }
	public float floorPoints() {
		float pointOfFloors = 0 ;
		int i ;
		for( i = 0 ; i < floor.length ; i++ ) {
			pointOfFloors += floor[i].floorPoint();
		}
		return pointOfFloors;
	}
	
	public float unitPoints() {
		int i ;
		float pointOfUnits = 0 ;
		for( i = 0 ; i < floor.length ; i++ ) {
			pointOfUnits += floor[i].unitPoints();
		}
		return pointOfUnits;
	}
	
	public float personPoints() {
		float pointOfPersons = 0;
		int i;
		for( i = 0 ; i < floor.length ; i++ ) {
			pointOfPersons += floor[i].personPoints();
		}
		return pointOfPersons;
	}
	
	public float homePoint() {
		float x = ( e + floorPoints() + 2 * unitPoints() + 3 * personPoints() );
		return x ;
		
	}
	
	public int cost() {
		
	}
	public void add() {
		int i ;
	    for ( i = 0 ; i<15 ; i++)
	        {
	    		if (homeCreate[i]==0)
	                break;
	        }
	        homeCreate[i] = 1 ;
	        setHomeId(homeId+1);
	    
	}
	public void upgrade() {
		
	}
}
