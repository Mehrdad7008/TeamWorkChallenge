package twModel;

import java.util.ArrayList;

public class Unit {
	
	private float point;
	private int b=2;
	private ArrayList <Person> people = new ArrayList<>();
	{

	}
	for()

	
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
