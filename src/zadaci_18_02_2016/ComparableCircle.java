package zadaci_18_02_2016;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	
public ComparableCircle() {
	super();
}
	// finds max circle object
	public static ComparableCircle max(ComparableCircle o, ComparableCircle o2) {
		if (o.compareTo(o2) > 0)
			return o;
		else
			return o2;
	}

	@Override
	public int compareTo(ComparableCircle o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
