package starfleet;

import java.util.*;

public class NameComparator implements Comparator<Spacecraft>{
	public int compare(Spacecraft s1,Spacecraft s2)
	{
		return s1.getClass().getName().compareTo(s2.getClass().getName());
	}

}
