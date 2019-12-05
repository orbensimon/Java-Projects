import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class NetworkApp {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		ArrayList<String> s=new ArrayList<String>();
		HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
		ArrayList<String> fr=new ArrayList<String>();
		HashMap<String,String> anim=new HashMap<String,String>();
		anim.put("Dan","Quakka");
		anim.put("Ella","Quakka");
		anim.put("Rina","Quakka");
		anim.put("Rona","Dog");
		anim.put("David","Dog");
		anim.put("Dor","Dog");
		anim.put("Gil","Dog");
		anim.put("Lior","Cat");
		fr.add("Lior");
		fr.add("Rona");
		map.put("Dan",fr);
		ArrayList<String> fr2=new ArrayList<String>();
		fr2.add("Rona");
		fr2.add("Dor");
		map.put("Ella",fr2);
		ArrayList<String> fr3=new ArrayList<String>();
		fr3.add("Ella");
		fr3.add("Dor");
		fr3.add("Dan");
		fr3.add("Rina");
		map.put("Rona",fr3);
		ArrayList<String> fr4=new ArrayList<String>();
		fr4.add("Dan");
		fr4.add("Rona");
		fr4.add("Rina");
		fr4.add("David");
		fr4.add("Gil");
		map.put("Lior",fr4);
		ArrayList<String> fr5=new ArrayList<String>();
		fr5.add("Rina");
		fr5.add("Lior");
		fr5.add("Gil");
		map.put("David",fr5);
		ArrayList<String> fr6=new ArrayList<String>();
		fr6.add("Rina");
		fr6.add("Ella");
		fr6.add("Rona");
		map.put("Dor",fr6);
		ArrayList<String> fr7=new ArrayList<String>();
		fr7.add("Rona");
		fr7.add("Lior");
		fr7.add("Dor");
		fr7.add("David");
		fr7.add("Gil");
		map.put("Rina",fr7);
		ArrayList<String> fr8=new ArrayList<String>();
		fr8.add("Rina");
		fr8.add("Lior");
		fr8.add("David");
		map.put("Gil",fr8);
		s=findAnimalHipsters(map,anim);
		set.addAll(s);
		System.out.println("Animal hipsters:\n"+set);

	}
	public static ArrayList<String> findAnimalHipsters(HashMap<String,ArrayList<String>> network,HashMap <String,String> favoriteAnimals)
	{
		int flag = 1;
		ArrayList<String> hipsters=new ArrayList<String>();
		Set<String> set= new HashSet<String>();
		set=network.keySet();
		Iterator<String> it=set.iterator();
		Iterator<String> lt;
		String animal;
		String name;
		ArrayList<String> friends=new ArrayList<String>();
		while(it.hasNext())
		{
			flag=1;
			name=it.next();
			animal=favoriteAnimals.get(name);
			friends.addAll(network.get(name));
			lt=friends.iterator();
			while(lt.hasNext())
			{
				if(animal.equalsIgnoreCase(favoriteAnimals.get(lt.next())))
				{
					flag=0;
					while(lt.hasNext())
						lt.next();
				}
			}
			if(flag!=0)
				hipsters.add(name);
			friends.clear();
		}
		return hipsters;
	}

}
