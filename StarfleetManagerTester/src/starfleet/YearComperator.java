package starfleet;

import java.util.*;

public class YearComperator implements Comparator<Spacecraft> {
	public int compare(Spacecraft o1,Spacecraft o2)
	{
		if(o1.getCommissionYear()>o2.getCommissionYear())
			return 1;
		else if(o1.getCommissionYear()>o2.getCommissionYear())
			return 0;
		return -1;
	}

}
