package starfleet;

import java.util.ArrayList;

public class Destroyer extends Spacecraft {
	public ArrayList<Weapon> destroyer_weapon=new ArrayList<Weapon>();
	private int num_of_teqh;
	public static int num_of_destroyer_ships=0;
	public Destroyer(String name, int commissionYear, float maximalSpeed,int cargoCapacity, ArrayList<Weapon> weaponArray, int numberOfTechnicians)
	{
		super(name,commissionYear,maximalSpeed,cargoCapacity);
		int sumfirepower=10;
		int i=0;
		for(Weapon weapon: weaponArray)
		{
			destroyer_weapon.add(weapon);
			sumfirepower+=destroyer_weapon.get(i).getfirepower();
			i++;
		}
		fire_power=sumfirepower;
		setnumofteqh(numberOfTechnicians);
		setAnnualMaintenanceCost(weaponArray,numberOfTechnicians);
		num_of_destroyer_ships++;
	}
	public void setAnnualMaintenanceCost(ArrayList<Weapon> weapon,int numberOfTechnicians)
	{
		int weapon_coast=0;
		double discount;
		int i;
		for(i=0;i<weapon.size();i++)
			weapon_coast+=weapon.get(i).getmaincoast();
		discount=(weapon_coast*((double)(10*numberOfTechnicians)/100));
		maintenance_coast=(int)((double)(weapon_coast-discount)+6000);
	}
	public void setnumofteqh(int numberOfTechnicians)
	{
		if(numberOfTechnicians<0)
		{
			System.out.println("Worng input- must be between 0-5, number of technicians set to 0");
			num_of_teqh=0;
		}
		else if(numberOfTechnicians>5)
		{
			System.out.println("Worng input- must be between 0-5, number of technicians set to 5");
			num_of_teqh=5;
		}
		else
			num_of_teqh=numberOfTechnicians;
	}
	public int getNumberOfTechnicians()
	{
		return num_of_teqh;
	}
	public int getAnnualMaintenanceCost()
	{
		return maintenance_coast;
	}
	public String toString()
	{
		return String.format("%s	weapoarray= %s	  NumberOfTechnicians=%d\n",super.toString(),destroyer_weapon.toString(),num_of_teqh);
	}
	public ArrayList<Weapon> getweaponarray()
	{
		return destroyer_weapon;
	}
	public int getFirePower()
	{
		return fire_power;
	}
}
