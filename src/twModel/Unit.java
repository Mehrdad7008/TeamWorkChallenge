
public class Unit {
	
	public Person[] person = new Person[1000000];
	private float point;
	private int b=2;
	
	public float unitPoint() {
		float point = 0;
		int i;
		for( i = 0 ; i < person.length ; i++ ) {
			point += person[i].personPoint();
		}
		return b + point;
	}
}
