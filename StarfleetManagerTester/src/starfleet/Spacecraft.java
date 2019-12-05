package starfleet;

import java.util.*;

public class Spacecraft implements ISpacecraft{
	protected String name;
	protected int year;
	protected float max_speed;
	protected int cargo_capacity;
	protected int fire_power=10;
	protected int maintenance_coast;
	protected ArrayList<Weapon> weapon=new ArrayList<Weapon>();
	public static int num_of_space_crafts=0;
	
	// Spacecraft constructor
	public Spacecraft(String spacecraftname,int spacecraftyear,float maxspeed,int cargocapacity)
	{
		name=spacecraftname;
		year=spacecraftyear;
		setmaxspeed(maxspeed);
		setcargocapacity(cargocapacity);
		num_of_space_crafts++;
		weapon=null;
	}
	// setters and getters and implementation of abstracts methods
	public void setname(String name)
	{
		name=this.name;
	}
	public String getname()
	{
		return name;
	}
	public void setyear(int year)
	{
		year=this.year;
	}
	public int getCommissionYear()
	{
		return year;
	}
	public void setmaxspeed(float maxspeed)
	{
		if(maxspeed<0)
		{
			System.out.println("Worng input- must be between 0-10, max speed set to 0");
			max_speed=maxspeed;
		}
		else if(maxspeed>10)
		{
			System.out.println("Worng input- must be between 0-10, max speed set to 10");
			max_speed=10;
		}
		else
			max_speed=maxspeed;
	}
	public float getMaximalSpeed()
	{
		return max_speed;
	}
	public void setcargocapacity(int cargocapacity)
	{
		if(cargocapacity<0)
		{
			System.out.println("Wrong input- must be vlue greater then 0, cargo capacity set to 0");
			cargo_capacity=0;
		}
		else
			cargo_capacity=cargocapacity;
		
	}
	public int getCargoCapacity()
	{
		return cargo_capacity;
	}
	public void setfirepower(int firepower)
	{
		fire_power=firepower;
	}
	public int getFirePower()
	{
		return fire_power;
	}
	public int getAnnualMaintenanceCost()
	{
		return maintenance_coast;
	}
	// end of setters and getters
	public String toString()
	{
		return String.format("%s\n	Name=%s\n	Commision Year=%d\n	MaximalSpeed=%.1f\n	CargoCapacity=%d\n	FirePower=%d\n	AnnualMaintenanceCost=%d\n",this.getClass().getSimpleName(),this.name,this.year,this.max_speed,this.cargo_capacity,this.fire_power,this.maintenance_coast);
	}
	public static int getNumOfSpacecraft()
	{
		return num_of_space_crafts;
	}
	public ArrayList<Weapon> getweaponarray()
	{
		return weapon;
	}

}
