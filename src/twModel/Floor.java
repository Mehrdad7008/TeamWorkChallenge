
public class Floor {
	private Unit[] unit = new Unit[100000];
	private int point;
	private int c=3;
	
	public float floorPoint() {
		return c + unitPoints() + 2*unit[0].personPoints();
	}
		
		public float unitPoints() {
			float pointOfUnits = 0 ;
			int i;
			for( i = 0 ; i < unit.length ; i++ ) {
				pointOfUnits += unit[i].unitPoint();
			}
			return pointOfUnits;
		}
		
	
}
	