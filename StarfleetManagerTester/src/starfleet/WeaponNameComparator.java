package starfleet;

import java.util.*;

public class WeaponNameComparator implements Comparator<Weapon>{
	public int compare(Weapon w1,Weapon w2)
	{
		return w1.getname().compareTo(w2.getname());
	}

}
