
public class Unit {
	
	public Person[] person = new Person[1000000];
	private float point;
	private int b=2;
	
	public float unitPoint() {
		return b + personPoints();
	}
	public float personPoints() {
		int i;
		float pointOfPersons = 0 ;
		for( i = 0 ; i < person.length ; i++ ) {
			pointOfPersons += person[i].personPoint();
		}
		return pointOfPersons;
	}
}
