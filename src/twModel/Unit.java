
public class Unit {
	
	public Person[] person = new Person[1000000];
	private float point;
	private int b=2;
	
	public float unitPoint() {
		float point;
		int i;
		for( i = 0 ; i < person.length ; i++ ) {
			point += Person.parseFloat(person[i]);
		}
		return b + point;
	}
}
