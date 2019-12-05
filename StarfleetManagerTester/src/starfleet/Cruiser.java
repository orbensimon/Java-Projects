package starfleet;

import java.util.ArrayList;

public class Cruiser extends Spacecraft {
	public ArrayList<Weapon> cruiser_weapon=new ArrayList<Weapon>();
	public static int num_of_cruiser=0;
	public Cruiser(String name, int commissionYear, float maximalSpeed,int cargoCapacity, ArrayList<Weapon> weaponArray)
	{
		super(name,commissionYear,maximalSpeed,cargoCapacity);
		int sumfirepower=10;
		int i=0;
		for(Weapon weapon:weaponArray)
		{
			cruiser_weapon.add(weapon);
			sumfirepower+=cruiser_weapon.get(i).getfirepower();
			i++;
		}
		fire_power=sumfirepower;
		setAnnualMaintenanceCost(weaponArray,maximalSpeed);
		num_of_cruiser++;
	}
	public void setAnnualMaintenanceCost(ArrayList<Weapon> weapon,float maximalSpeed)
	{
		int weapon_coast=0;
		int i;
		for(i=0;i<weapon.size();i++)
			weapon_coast+=weapon.get(i).getmaincoast();
		maintenance_coast=(int)(2000+weapon_coast+(int)(maximalSpeed*1000));
	}
	public int getAnnualMaintenanceCost()
	{
		return maintenance_coast;
	}
	public String toString()
	{
		return String.format("%s	weaponarray= %s\n",super.toString(),cruiser_weapon.toString());
	}
	public ArrayList<Weapon> getweaponarray()
	{
		return cruiser_weapon;
	}
	public int getFirePower()
	{
		return fire_power;
	}
}
