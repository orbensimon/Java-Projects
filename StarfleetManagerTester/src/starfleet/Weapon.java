package starfleet;

public class Weapon {
	private String name;
	private int firepower;
	private int maincoast;
	public Weapon(String weaponname,int weaponfirepower,int nnualMaintenanceCost)
	{
		name=weaponname;
		firepower=weaponfirepower;
		maincoast=nnualMaintenanceCost;
	}
	public void setname(String weaponname)
	{
		name=weaponname;
	}
	public String getname()
	{
		return name;
	}
	public void setfirepower(int firepower)
	{
		firepower=this.firepower;
	}
	public int getfirepower()
	{
		return firepower;
	}
	public void setmaincoast(int maincoast)
	{
		maincoast=this.maincoast;
	}
	public int getmaincoast()
	{
		return maincoast;
	}
	public String toString()
	{
		return String.format("name=%s ,firepower=%d ,annualMaintenanceCost=%d\n",name,firepower,maincoast);
	}

}
