package wordcount;
import java.util.*;
public class ValueComparator implements Comparator<Object>{
	public int compare(Object o1,Object o2)
	{
		return ((Map.Entry<String, Integer>) o2).getValue().compareTo(((Map.Entry<String, Integer>) o1).getValue());
	}

}
