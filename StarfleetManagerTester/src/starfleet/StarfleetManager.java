package starfleet;

import java.util.ArrayList;
import java.util.*;

public class StarfleetManager {

	/**
	 * Returns a Arraylist containing string representation of all fleet ships, sorted in ascending order by
	 * commission year.
	 */
	public static ArrayList<String> getSpacecraftDescriptionsByCommissionYear(ArrayList<ISpacecraft> fleet)
	{
		int i=0;
		String string;
		ArrayList<String> array=new ArrayList<String>();
		ArrayList<Spacecraft> spacecraft=new ArrayList<Spacecraft>();
		for(i=0;i<fleet.size();i++)
			spacecraft.add((Spacecraft) fleet.get(i));
		Collections.sort(spacecraft,new YearComperator());
		for(i=0;i<spacecraft.size();i++)
		{
			string=spacecraft.get(i).toString();
			array.add(string);
		}
			
		return array;
	}
	/**
	 * Prints and the number of instances created for each spacecraft
	 */
	public static void printInstanceNumberPerClass (ArrayList<ISpacecraft> fleet)
	{
		int i=0;
		String classname;
		ArrayList<Spacecraft> spacecraft=new ArrayList<Spacecraft>();
		for(i=0;i<fleet.size();i++)
			spacecraft.add((Spacecraft) fleet.get(i));
		Collections.sort(spacecraft,new NameComparator());
		for(i=0;i<spacecraft.size();i++)
		{
			classname=spacecraft.get(i).getClass().getSimpleName();
			if(i==0)
			{
				if(spacecraft.get(i) instanceof CargoShip)
					System.out.printf("%s	%d\n",classname,CargoShip.num_of_cargo_ship);
				else if(spacecraft.get(i) instanceof Cruiser)
					System.out.printf("%s	%d\n",classname,Cruiser.num_of_cruiser);
				else if(spacecraft.get(i) instanceof ResearchShip)
					System.out.printf("%s	%d\n",classname,ResearchShip.num_of_rs_ships);
				else if(spacecraft.get(i) instanceof Destroyer)
					System.out.printf("%s	%d\n",classname,Destroyer.num_of_destroyer_ships);
			}
			else if(classname.compareTo(spacecraft.get(i-1).getClass().getSimpleName())!=0)
			{
				if(spacecraft.get(i) instanceof CargoShip)
					System.out.printf("%s	%d\n",classname,CargoShip.num_of_cargo_ship);
				else if(spacecraft.get(i) instanceof Cruiser)
					System.out.printf("%s	%d\n",classname,Cruiser.num_of_cruiser);
				else if(spacecraft.get(i) instanceof ResearchShip)
					System.out.printf("%s	%d\n",classname,ResearchShip.num_of_rs_ships);
				else if(spacecraft.get(i) instanceof Destroyer)
					System.out.printf("%s	%d\n",classname,Destroyer.num_of_destroyer_ships);

			}
		}
			
	}

	/**
	 * Returns the total annual maintenance cost of the fleet (which is the sum of maintenance costs of all the fleet's ships)
	 */
	public static int getTotalMaintenanceCost (ArrayList<ISpacecraft> fleet)
	{
		int i=0;
		int sum=0;
		ArrayList<Spacecraft> spacecraft=new ArrayList<Spacecraft>();
		for(i=0;i<fleet.size();i++)
			spacecraft.add((Spacecraft) fleet.get(i));
		for(i=0;i<spacecraft.size();i++)
			sum+=spacecraft.get(i).maintenance_coast;
		return sum;
	}


	/**
	 * Returns the total fire power of the fleet (which is the sum of fire power of all the fleet's ships)
	 */
	public static int getTotalFleetFirePower (ArrayList<ISpacecraft> fleet)
	{
		int i=0;
		int sum=0;
		ArrayList<Spacecraft> spacecraft=new ArrayList<Spacecraft>();
		for(i=0;i<fleet.size();i++)
			spacecraft.add((Spacecraft) fleet.get(i));
		for(i=0;i<spacecraft.size();i++)
			sum+=spacecraft.get(i).getFirePower();
		return sum;
	}


	/**
	 * Returns the total cargo carrying capacity of the fleet (which is the sum of cargo capacity of all the fleet's ships)
	 */
	public static int getTotalFleetCargoCapacity (ArrayList<ISpacecraft> fleet)
	{
		int i=0;
		int sum=0;
		ArrayList<Spacecraft> spacecraft=new ArrayList<Spacecraft>();
		for(i=0;i<fleet.size();i++)
			spacecraft.add((Spacecraft) fleet.get(i));
		for(i=0;i<spacecraft.size();i++)
			sum+=spacecraft.get(i).cargo_capacity;
		return sum;
	}


	/**
	 * Returns the average of maximal speed of all the fleet's ships
	 */
	public static float getFleetAverageOfMaximalSpeed (ArrayList<ISpacecraft> fleet)
	{

		int i=0;
		float sum=0;
		ArrayList<Spacecraft> spacecraft=new ArrayList<Spacecraft>();
		for(i=0;i<fleet.size();i++)
			spacecraft.add((Spacecraft) fleet.get(i));
		for(i=0;i<spacecraft.size();i++)
			sum+=spacecraft.get(i).max_speed;
		return (sum/Spacecraft.getNumOfSpacecraft());
	}


	/**
	 * Returns an Arraylist of Strings of all names of all the fleet's weapons installed on any ship, without repetitions
	 * in increasing order
	 */
	public static ArrayList<String> getFleetWeaponNames (ArrayList<ISpacecraft> fleet)
	{
		int i=0,j=0;
		String classname,weaponname;
		ArrayList<Spacecraft> space=new ArrayList<Spacecraft>();
		ArrayList<Spacecraft> spacecraft=new ArrayList<Spacecraft>();
		ArrayList<Weapon> weapon=new ArrayList<Weapon>();
		ArrayList<String> weapon2=new ArrayList<String>();
		for(i=0;i<fleet.size();i++)
			space.add((Spacecraft) fleet.get(i));
		for(i=0;i<fleet.size();i++)
		{
			classname=space.get(i).getClass().getSimpleName();
			if(classname.compareTo("Destroyer")==0 || classname.compareTo("Cruiser")==0)
			{
				spacecraft.add((Spacecraft) fleet.get(i));
				weapon.addAll(spacecraft.get(j).getweaponarray());
				j++;
			}
		}
		Collections.sort(weapon,new WeaponNameComparator());
		for(i=0;i<weapon.size();i++)
		{
			weaponname=weapon.get(i).getname();
			if(i==0)
				weapon2.add(weapon.get(i).getname());
			else if(weaponname.compareTo(weapon.get(i-1).getname())!=0)
				weapon2.add(weapon.get(i).getname());
		}
		return weapon2;
	}






}
